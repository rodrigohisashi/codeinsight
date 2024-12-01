// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s03ativ15 {
	//Declarando 'fora do main' para que possa ser acessado em outro mÛdulos 
	//Declarando buffer de entrada de dados para N⁄MEROS (inclus„o autom·tica) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instruÁ„o abaixo obriga o programa a rodar com configuraÁ„o de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int n,v,c,k=0,l=0,m=0;
		System.out.print( "N: ");
		n = teclado1.nextInt();
		if (n==0){
		}
		else {
			for (c=0;c<n;c=c+1){
				System.out.print( "Valores: ");
				v = teclado1.nextInt();
				if (v==0){
					k = k+1;
					System.out.print( "Nulo = "+k);
				}
				if (v%3==0){
					l = l+1;
					System.out.print( "Divisivel por 3 = "+l);
				}
				if (v%3!=0){
					m = m+1;
					System.out.print( "Nao divisivel por 3 = "+m);
				}
			}
		}
	}
}

//AtenÁ„o: Este conversor est· sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se h· erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentaÁ„o) do programa gerado
