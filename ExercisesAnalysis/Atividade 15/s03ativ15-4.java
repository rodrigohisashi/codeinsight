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
		int num,ind,nulo=0,div=0,ndiv=0;
		System.out.print( "Escolha uma quantidade de números para informar: ");
		num = teclado1.nextInt();
		for (ind=1;ind<=num;ind++){
			int var;
			System.out.print( "Informe o número "+ ind + ":");
			var = teclado1.nextInt();
			if (var==0){
				nulo  =  nulo + 1;
			}
			if (var%3==0){
				if (var!=0){
					div  =  div + 1;
				}
			}else 
				ndiv  =  ndiv + 1;
			}
		}
		//escreva( num + " números foram informados, sendo " + nulo + " deles nulos, " + div + " deles divisíveis por três e " + ndiv + " não divisíveis por três.");
		System.out.print( "\nNulos = " + nulo);
		System.out.print( "\nDivisiveis por 3 = " + div);
		System.out.print( "\nNao divisiveis por 3 = " + ndiv);
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
