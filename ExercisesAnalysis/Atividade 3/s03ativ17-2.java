import java.util.Scanner;
public class  s03ativ17{
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    
    float salario=0.0, numFilhos, cont=0.0, acum=0.0, soma=0.0, var=0.0;
    float mediaSalario = 0.0, mediaFilhos = 0.0, salarioMil = 0.0;

    salario = entrada.nextInt();
    
        while(salario > 0){
            cont= cont + salario; // soma os salarios

            numFilhos= entrada.nextInt();
            
            while(numFilhos < 0){
            System.out.println("Erro: Redigite numero de filhos!");
                numFilhos = entrada.nextInt();
            }
                acum= acum + numFilhos;                                   

                salario = entrada.nextInt();
                soma= soma+1; // conta as pessoas
                if(salario <= 1000){
                    var = var+1; //conta as pessoas com salario menor q 1000    
                }   
            
        }
 
        mediaSalario = cont/soma;
        mediaFilhos = acum/soma;
        salarioMil = (var*100)/soma;
        

        System.out.println("Media Salario = " +mediaSalario);
        System.out.println("Media Numero de Filhos = " +mediaFilhos);
        System.out.println("Percentual Pessoas com salario ate 1000 reais = " +
        +salarioMil+"%");
    
               
    }

}