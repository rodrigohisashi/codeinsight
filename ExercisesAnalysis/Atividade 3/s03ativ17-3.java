// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s03ativ17 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		double salario,filhos,media_salario=0,media_filhos=0,perct_p_sal_1000=0;
		int pessoas=1;
		System.out.print( "\nQuantos filhos voce tem?");
		filhos = teclado1.nextDouble();
		if (filhos>=0){
			System.out.print( "\nQual seu salario?");
			salario = teclado1.nextDouble();
			while (salario>0){
				media_salario = media_salario+salario/pessoas;
				System.out.print( "\nMedia Salario = "+ media_salario);
				media_filhos = media_filhos+filhos/pessoas;
				System.out.print( "\nMedia Numero de Filhos = "+ media_filhos);
				for (salario=1;salario<=1000;perct_p_sal_1000=perct_p_sal_1000/pessoas){
					System.out.print( "\nPercentual Pessoas com salario ate 1000 reais = "+ perct_p_sal_1000)}}};
					else {
						System.out.print( "\nErro: Redigite numero de filhos!")};
						do {
							System.out.print( "\nQuantos filhos voce tem?");
							filhos = teclado1.nextDouble();
							System.out.print( "\nQual seu salario?");
							salario = teclado1.nextDouble();
							pessoas = pessoas+1;
						}
					}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
