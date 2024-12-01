import java.util.Scanner;

public class s03ativ17 {
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
    int
      entrevistados = 0,
      c = 0;

		double
      salario  =  0.0,
      filhos  =  0.0,
      contador  =  0.0,
      somaSalario  =  0.0,
      somaFilhos  =  0.0,
      mediaSalario  =  0.0,
      mediaFilhos  =  0.0,
      porcentagem  =  0.0;

		// Quantidade de entrevistados C
		System.out.print( "Digite a quantidade de entrevistados: ");
		entrevistados = teclado1.nextInt();

		for (c=0;c<entrevistados;c++){
			System.out.print( " * Dados do entrevistado: "+ (c + 1) + "\n");
			System.out.print( "- Digite o salario: ");

      salario = teclado1.nextDouble();
			
			if (salario<0){
				break;
			}

			if (salario<=1000){
				contador  =  contador + 1;
			}

			porcentagem  =  contador/entrevistados * 100;
			somaSalario  =  somaSalario + salario;

			System.out.print( "- Digite o numero de filhos: ");
			filhos = teclado1.nextDouble();

			while (filhos<0){
				System.out.print( "Erro: Redigite numero de filhos! ");
			  System.out.print( "- Digite o numero de filhos: ");

        filhos = teclado1.nextDouble();
			}

			somaFilhos  =  somaFilhos + filhos;
			mediaSalario  =  somaSalario/entrevistados;
			mediaFilhos  =  somaFilhos/entrevistados;
		}

		System.out.println( "Media Salario = "+ mediaSalario);
		System.out.println( "Media Numero de Filhos = "+ mediaFilhos);
		System.out.println( "Percentual Pessoas com salario ate 1000 reais = "+ porcentagem+ "%");
	}
}
