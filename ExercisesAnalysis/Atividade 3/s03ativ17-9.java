
import java.util.Scanner;

public class s03ativ17 {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		double filhos,pessoas,msalario,mfilhos,percentual, soma=0,cont=0,cont2=0,c=0,salario = 1;
		
		if (salario==0){
			System.out.println("\nMedia Salario = 0");
				System.out.println("\nMedia Numero de Filhos = 0");
				System.out.println("\nPercentual Pessoas com salario ate 1000 reais = 0%");}
		while(salario>0){
		System.out.println("Digite o seu salario: ");
		salario = entrada.nextInt();
		
	    
		if(salario>0){
		soma=soma+salario;
		c=c+1;
		System.out.println("Digite o número de filhos que você tem: ");
		filhos = entrada.nextInt();
		cont= cont + filhos;
		if(filhos<0){
			  System.out.println("Erro: Redigite numero de filhos!");
			  
		    
		}
		else{
		if(salario<=1000){
				cont2 = cont2+1;
		    
		}
		
		}
		}
		
		}
		
		
		
		
		percentual=(cont2*100)/c;
		msalario=soma/c;
		mfilhos=cont/c;
		System.out.println("\nMedia Salario = "+ msalario);
				System.out.println("\nMedia Numero de Filhos = "+ mfilhos);
				System.out.println("\nPercentual Pessoas com salario ate 1000 reais = "+ percentual+ "%");
		
	
}
}


