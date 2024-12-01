// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

import java.util.Scanner;

public class s03ativ15 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int n,a,d3=0,dn3=0,nulo=0;
		//System.out.print( "N: ");
		n = teclado1.nextInt();
		for (int c=1;c<=n;c=c+1){
			//System.out.print( "Valores: ");
			a = teclado1.nextInt();
			if (a%3==0 || a==0){
				d3+ = 1;
			}
			else {
				dn3+ = 1;
			}
			if (a==0){
				nulo+ = 1;
			}
		}
		System.out.print( "Nulos = "+ nulo+ "\nDivisiveis por 3 = "+ d3+ "\nNao divisiveis por 3 = "+ dn3);
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
