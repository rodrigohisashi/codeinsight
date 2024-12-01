
import java.util.Scanner;

public class s03ativ15 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int n,valor,contnulos=0,contdiv=0,contnao=0;
	//	System.out.print( "digite o valor de n:");
		n = teclado1.nextInt();
		for (int i=1;i<=n;i=i+1){
			//System.out.print( "digite um valor: ");
			valor = teclado1.nextInt();
			if (valor==0){
				contnulos = contnulos +1;
			}
			else {
				if (valor%3==0){
					contdiv = contdiv+1;
				}
				else {
					contnao = contnao+1;
				}
			}
		}
		System.out.println( "Nulos = "+ contnulos);
		System.out.println( " Divisiveis por 3 = "+ contdiv);
		System.out.println( " Nao divisiveis por 3 = "+ contnao);
	}
}

