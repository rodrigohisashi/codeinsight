// Note que a classe deve se chamar s03ativ16
// Exclua ou comente a linha do "package"
// Lembre-se de "comentar" as intruções de System.out.print que  não fazem parte da SAÍDA de ** RESULTADOS ** especificada
//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s03ativ16 {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int n,idade,menor=300;
		//System.out.print( "digite o valor de n:");
		n = teclado1.nextInt();
		for (int i=1;i<=n;i=i+1){
			System.out.print( "digite a idade: ");
			idade = teclado1.nextInt();
			while (idade<=0){
				System.out.print( "Erro:Redigite idade!");
			}
			if (idade<menor){
				menor = idade;
			}
		}
		System.out.print( "menor idade = "+ menor);
	}
}

