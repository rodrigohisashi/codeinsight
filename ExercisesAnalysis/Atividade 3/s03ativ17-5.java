// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s03ativ17 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	int filhos,c;
	double soma_filhos,soma_salario,soma_ate1000,salario,media_salario,media_filhos,pate1000;
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		soma_filhos = 0;
		soma_ate1000 = 0;
		//System.out.print( "salario = ");
		salario = teclado1.nextDouble();
		soma_salario = salario;
		c = 0;
		media_salario=0;
		media_filhos=0;
		pate1000=0;
		while (salario>0){
			if (c==0){
				//System.out.print( "nÃºmero de filhos = ");
				filhos = teclado1.nextInt();
				while (filhos<0){
					System.out.print( "Erro: Redigite numero de filhos!");
					filhos = teclado1.nextInt();
				}
				soma_filhos = soma_filhos+filhos;
				soma_salario = salario;
				c = c+1;
			}
			else {
				//System.out.print( "salario = ");
				salario = teclado1.nextDouble();
				if (salario>0){
					//System.out.print( "nÃºmero de filhos = ");
					filhos = teclado1.nextInt();
					while (filhos<0){
						System.out.print( "Erro: Redigite numero de filhos!");
						filhos = teclado1.nextInt();
					}
					soma_filhos = soma_filhos+filhos;
					soma_salario = soma_salario+salario;
					c = c+1;
				}
				else {
					c = c;
				}
			}
			if (salario<=1000 && salario>0){
				soma_ate1000 = soma_ate1000+1;
			}
			media_filhos= ( soma_filhos)/c;
			media_salario= ( soma_salario)/c;
			pate1000= ( soma_ate1000/c)*100;
		}
		System.out.print( "\nMedia Salario = "+ media_salario);
		System.out.print( "\nMedia Numero de Filhos ="+ media_filhos);
		System.out.print( "\nPercentual Pessoas com salario ate 1000 reais ="+ pate1000+ "%");
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
