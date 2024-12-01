// ### Programa JAVA gerado por PortuJava --> ## Versao 2.4 - 29/03/2019 - 19h13##

//Incluindo Bibliotecas Java (entrada de dados) --
import java.util.Scanner;

public class s03ativ16.por {
	//Declarando 'fora do main' para que possa ser acessado em outro módulos 
	//Declarando buffer de entrada de dados para NÚMEROS (inclusão automática) ----
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	//A instrução abaixo obriga o programa a rodar com configuração de PONTO DECIMAL
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int numero,idade,c,menor,i;
		System.out.print( "Digite o nÃºmero de pessoas que vocÃª deseja solicitar a idade:");
		numero = teclado1.nextInt();
		c = 1;
		menor = 0;
		i = 0;
		do {
			System.out.print( "Digite a idade das pessoas escolhidas:");
			idade = teclado1.nextInt();
			while (idade<=0){
				System.out.print( "\nErro: Redigite idade!");
				System.out.print( "\nDigite a idade das pessoas escolhidas:");
				idade = teclado1.nextInt();
				if (i==0){
					menor = idade;
					i = i+1;
				}
				else {
					if (idade<menor){
						menor = idade;
					}
				}
				c = c+1;
			} while (c<=numero);
			{
				System.out.print( "Menor idade = "+ menor);
			}
		}
	}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
