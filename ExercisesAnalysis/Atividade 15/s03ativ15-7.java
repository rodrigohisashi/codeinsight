
import java.util.Scanner;
/**
 *
 * @author DANIELLA
 */
public class s03ativ15{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int quant, ns, c, divisiveis, nulo, ndivisiveis;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite quantos números inteiro você quer solicitar:");
        quant=entrada.nextInt();
        
        
        divisiveis = 0;
        nulo = 0;
        ndivisiveis = 0;
        
        for (c=0; c<=quant, c++){
		 System.out.print("Digite os números escolhidos:");
		 ns=entrada.nextInt();
			if (ns==0){
			 nulo=nulo+1;
			}
			else{
				if((ns%3)==0){
				 divisiveis=divisiveis+1;
				}
                else{
				 ndivisiveis=ndivisiveis+1;
				c=c+1;}
				}
                
	                }

        System.out.println("Nulos = " + nulo);
        System.out.println("Divisiveis por 3 = " + divisiveis);
        System.out.println("Nao divisiveis por 3 = " + ndivisiveis);}
    }
    
    

