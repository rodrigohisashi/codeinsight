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
		int c=1,soma1=0,soma2=0,soma3=0;
		int N, n;
		System.out.print( "N: ");
		N = teclado1.nextInt();
	
		if (N>0){
			do {
			    System.out.print( "valores: ");
				n = teclado1.nextInt();
				if (n==0){
					soma1 +=  1;
				}else 
					if (n%3==0){
						soma2 +=  1;
					}else 
						soma3 +=  1;
						
					c += 1;
					
				
			}while (n <= N);
			System.out.print( "\nNulos = "+ soma1);
			System.out.print( "\nDivisiveis por 3 = "+ soma2 );
			System.out.print( "\nNao divisiveis por 3 = "+ soma3);
		}else 
			System.out.print( "\nNulos = 0");
			System.out.print( "\nDivisiveis por 3 = 0" );
			System.out.print( "\nNao divisiveis por 3 = 0");
		}
	}


//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
