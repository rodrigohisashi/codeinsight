
# CodeInsight - README

## Organização das Pastas

- **CodeInsight**: Contém o código da API desenvolvido em Flask (Python). Essa API é responsável por integrar-se ao Ollama para rodar modelos de LLMs localmente e fornecer feedbacks automáticos aos alunos com base em seus códigos submetidos.

- **ExercisesAnalysis**: Diretório contendo todos os exercícios analisados. Esses exercícios foram fornecidos pelo professor e utilizados para avaliar a eficácia de diferentes modelos de LLMs no contexto educacional e determinar qual modelo apresentou melhor desempenho.

- **MoodleVPLModification**: Inclui o arquivo modificado do VPL para permitir a integração do Moodle com o CodeInsight. A modificação possibilita realizar uma requisição CURL à API para gerar feedbacks.

---

## Como Rodar o CodeInsight

1. Certifique-se de que o Docker e o Docker Compose estejam instalados em seu ambiente.
2. Navegue até o diretório **CodeInsight**.
3. Execute o comando a seguir para iniciar os serviços:
   ```bash
   docker-compose up
   ```
   Esse comando irá configurar e iniciar o contêiner da API Flask e do Ollama. Durante o processo, o modelo **Mistral Nemo** será baixado automaticamente no Ollama para ser utilizado na geração de feedbacks.

---

## Como Modificar o Moodle para Integrar com o CodeInsight

1. Antes de realizar qualquer modificação, baixe e instale o Moodle com o plugin **Virtual Programming Lab (VPL)** já configurado.
2. Localize o arquivo do VPL que deverá ser alterado. Esse arquivo pode variar dependendo da instalação, mas geralmente estará dentro do diretório do VPL no Moodle.
3. Substitua o arquivo correspondente pelo que está no diretório **MoodleVPLModification** deste repositório.
4. Após realizar a substituição, o Moodle estará configurado para realizar requisições CURL para a API do CodeInsight.

---

## Observações
- Certifique-se de que os serviços do CodeInsight estejam em execução (via Docker) antes de utilizar o Moodle, para garantir que as requisições sejam processadas corretamente.
- Durante os testes, utilizamos o Moodle em contêiner Docker, configurado para utilizar a mesma rede Docker que o CodeInsight, possibilitando a comunicação direta entre os serviços. Caso o ambiente seja configurado em produção, ajustes adicionais podem ser necessários, como a definição de redes externas, variáveis de ambiente e regras de firewall.
- Para mais informações sobre os modelos de LLMs utilizados e as análises realizadas nos exercícios, consulte a documentação adicional incluída neste repositório.

