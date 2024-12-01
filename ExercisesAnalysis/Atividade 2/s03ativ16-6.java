// Note que a classe deve se chamar s03ativ16
// Exclua ou comente a linha do "package"
// Lembre-se de "comentar" as intruções de System.out.print que  não fazem parte da SAÍDA de ** RESULTADOS ** especificada
// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s03ativ16 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
		java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int n,idade,menorlido=100,cont=1;
		char dado;
		n = teclado1.nextInt();
		while (cont<=n) {
			idade = teclado1.nextInt();
			if (idade<0) { 
				System.out.print( "Erro: Redigite idade!\n");
			}
			
			else if (idade<menorlido) {
				menorlido=idade;
			}
					
			cont+= 1;
				     
			      
		}
					
		System.out.print( "\nMenor idade = "+menorlido);
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
