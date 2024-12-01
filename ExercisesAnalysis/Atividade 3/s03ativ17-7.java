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
		double ms,salario,filhos,mfilhos,mil,tsalario,q,tfilhos,l,m,u,t;
	
		salario = teclado1.nextDouble();
		tsalario = 0;
		tfilhos = 0;
		q = 0;
		m = 0;
		l = 0;
		while (salario>0){
			m = m+1;
			tsalario = tsalario+salario;
			if (salario>=1000){
				q = q+1;
			}
			
			filhos = teclado1.nextDouble();
			while (filhos<0){
				System.out.print( "Erro: Redigite numero de filhos!");
				filhos = teclado1.nextDouble();
			}
			if (filhos>=0){
				tfilhos = tfilhos+filhos;
			}
			
			salario = teclado1.nextDouble();
		}
		ms = tsalario/m;
		mfilhos = tfilhos/m;
		t = q/m;
		u=t*10;
		
		System.out.print( "Media Salario = "+ms);
		System.out.print( "Media Numero de Filhos = "+mfilhos);
		System.out.print( "Percentual Pessoas com salario ate 1000 reais="+u+"%");
	}
}

//Atenção: Este conversor está sujeito a erros dependendo do arquivo de origem (.por)
//   (a) Abra seu arquivo em um editor Java e verifique se há erros
//   (b) use as teclas ALT+SHIFT+F para fazer o alinhamento (endentação) do programa gerado
