// Note que a classe deve se chamar s03ativ15
// Exclua ou comente a linha do "package"
// Lembre-se de "comentar" as intruções de System.out.print que  não fazem parte da SAÍDA de ** RESULTADOS ** especificada

// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s03ativ15 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int N,mult3,naoMult3,nulo,numero,x;
		mult3 = 0;
		naoMult3 = 0;
		nulo = 0;
	//	System.out.print( "Digite um numero inteiro, N, da sequencia para verificar a existencia de multiplos de 3\nN= ");
		N = teclado1.nextInt();
		for (x=1;x<=N;x=x+1)
		{
	//		System.out.print( "Digite o numero "+x+" :");
			numero = teclado1.nextInt();
			if (numero==0)
			{
				nulo = nulo+1;
			}
			else 
			{
				if (numero%3==0)
				{
					mult3 = mult3+1;
				}
				else 
				{
					if (numero%3!=0)
					{
						naoMult3 = naoMult3+1;
					}
				}
			}
		}
		System.out.print( "\nNulos = "+nulo+"\nDivisiveis por 3 = "+mult3+"\nNao divisiveis por 3 = "+naoMult3);
	}
}