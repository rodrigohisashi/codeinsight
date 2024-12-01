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
		int n,num,nulo,d,c,nd;
		n = teclado1.nextInt();
		d = 0;
		nulo = 0;
		nd = 0;
		while (n>0){
			num = teclado1.nextInt();
			n = n-1;
			c = num%3;
			if (num<=0){
				nulo = nulo+1;
			}
			if (c<=0){
				d = d+1;
			}
			else {
				nd = nd+1;
			}
		}
		System.out.println( "Nulos ="+nulo);
		System.out.println( "Divisiveis por 3 = "+d);
		System.out.println( "Nao divisiveis por 3 ="+nd);
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
