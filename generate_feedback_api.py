from flask import Flask, request, jsonify
import json
import requests

app = Flask(__name__)


def generate_feedback(problem_description, code_snippet, execution_code, model_name='zephyr'):
    url = 'http://ollama:11434/api/generate'  # Assumindo que o Ollama está rodando localmente
    headers = {'Content-Type': 'application/json'}
    prompt = (
        "Considere que você seja um monitor em um curso introdutório de programação. "
        "A tarefa proposta para um aluno é:\n"
        f"{problem_description}\n\n"
        "A solução fornecida pelo aluno foi:\n"
        f"{code_snippet}\n\n"
        "A execução do código para os casos de teste foi:\n"
        f"{execution_code}\n\n"
        "Qual o feedback para esta solução?\n"
        "Se a solução estiver correta, somente escreva 'A solução está correta!'.\n"
        "Senão, escreva 'A solução está incorreta!', seguido dos erros e divergências das instruções.\n"
        "Não mostre a solução completamente nem partes dela."
    )
    data = {
        "model": model_name,
        "prompt": prompt,
        "temperature": 1.0
    }

    app.logger.info("Enviando requisição para o modelo com os seguintes parâmetros: %s", data)

    # Faz a requisição POST
    response = requests.post(url, headers=headers, data=json.dumps(data))

    # Trata a resposta
    response_parts = response.text.splitlines()
    full_response = ''
    for part in response_parts:
        json_part = json.loads(part)
        full_response += json_part['response']

    return full_response


@app.route('/generate_feedback', methods=['POST'])
def generate_feedback_api():
    data = request.get_json()
    problem_description = data.get('problem_description')
    code_snippet = data.get('code_snippet')
    execution_code = data.get('execution_code')
    model_name = data.get('model_name', 'zephyr')

    if not all([problem_description, code_snippet, execution_code]):
        return jsonify({'error': 'Parâmetros faltando'}), 400

    feedback = generate_feedback(problem_description, code_snippet, execution_code, model_name)
    if feedback is None:
        return jsonify({'error': 'Erro ao gerar feedback'}), 500

    return jsonify({'feedback': feedback}), 200


def read_code_from_file(filename):
    try:
        with open(filename, 'r', encoding='utf-8') as file:
            return file.read()
    except FileNotFoundError:
        print(f"Error: The file '{filename}' does not exist.")
        return None
    except Exception as e:
        print(f"An error occurred: {e}")
        return None

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
