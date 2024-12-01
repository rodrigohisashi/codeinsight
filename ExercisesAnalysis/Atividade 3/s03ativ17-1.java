// Note que a classe deve se chamar s03ativ17
// Exclua ou comente a linha do "package"
// Lembre-se de "comentar" as intruções de System.out.print que  não fazem parte da SAÍDA de ** RESULTADOS ** especificada

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
		int sal=1,filhos;
		double abaixodemil=0,somasal=0,somafilhos=0,cont=0;
		if (sal>0){
			while (sal>0){
				//System.out.print( "salario = ");
				sal = teclado1.nextInt();
				if (sal>0){
					//System.out.print( "numero de filhos = ");
					filhos = teclado1.nextInt();
					while (filhos<0){
						System.out.print( "Erro: Redigite numero de filhos!\n");
						filhos = teclado1.nextInt();
					}
					somasal  =  somasal + sal;
					somafilhos  =  somafilhos + filhos;
					cont++;
					if (sal<=1000){
						abaixodemil++;
					}
				}
				else {
					if (cont>1){
						cont  =  cont;
					}else {
						cont  =  1;
					}
				}
			}
			System.out.print( "Media Salario = "+somasal/cont);
			System.out.print( "\nMedia Numero de Filhos = "+somafilhos/cont);
			System.out.print( "\nPercentual Pessoas com salario ate 1000 reais = "+ (  abaixodemil/cont)*100+"%");
		}
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
