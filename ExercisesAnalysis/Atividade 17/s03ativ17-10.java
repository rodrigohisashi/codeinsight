// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s03ativ17 {
	//Declarando 'fora do main' para que possa ser acessado em outro mÛdulos 
	//Declarando buffer de entrada de dados para N⁄MEROS (inclus„o autom·tica) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instruÁ„o abaixo obriga o programa a rodar com configuraÁ„o de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		double salario,filhos,b=0,c=0,medias=0,mediaf=0,k=0,m=0,n=0,porc=0;
		while (c>=0){
			System.out.print( "");
			salario = teclado1.nextDouble();
			if (salario<=0){
				c = salario;
				c = -1;
			}
			else {
				System.out.print( "");
				filhos = teclado1.nextDouble();
				if (filhos<0){
					while (filhos<0){
						System.out.print( "\nErro: Redigite o numero de filhos!");
						filhos = teclado1.nextDouble();
					}
				}
				if (salario<=1000){
					k = k+1;
					c = c+1;
					n = n+salario;
				}
				else {
					c = c+1;
					n = n+salario;
				}
				else {
					m = m+filhos;
					b = b+1;
				}
			}
			if (b>0){
				medias = n/b;
				mediaf = m/b;
				porc= ( k/b)*100;
			}
			else {
				medias = 0;
				mediaf = 0;
				porc = 0;
			}
			System.out.print( "\nMedia Salario = "+ medias);
			System.out.print( "\nMedia Numero de Filhos = "+mediaf);
			System.out.print( "\nPorcentagem com salario ate 1000 reais = "+ porc+"%");
		}
	}
}

//AtenÁ„o: Este conversor est· sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se h· erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentaÁ„o) do programa gerado
