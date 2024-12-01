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
		int n,num,nulo=0,c=0,div3=0,ndiv3=0;
		System.out.print( "N: ");
		n = teclado1.nextInt();
		while (n>c){
			num = teclado1.nextInt();
			if (num==0){
				nulo  =  nulo++;
			}
			else if (num%3==0){
				div3 =  div3++;
			}
			else if (num%3!=0){
				ndiv3  =  ndiv3++;
			}
			c  =  c++;
		}
		System.out.print( "\nNulos = "+ nulo);
		System.out.print( "\nDivisiveis por 3 = "+ div3);
		System.out.print( "\nNao divisiveis por 3 = "+ ndiv3);
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
