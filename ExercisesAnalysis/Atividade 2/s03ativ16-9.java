
import java.util.Scanner;

public class s03ativ16{
public static void main(String[] args) {
   
    int n,c,a = 50;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Enter the amount of ages");
    n = teclado.nextInt();
    
    for(c=0;c<n;c++){
            System.out.println("Type the ages:");
            c = teclado.nextInt();
            
            while(c<0){
                System.out.println("Type the age");
            }
            
}
    if(a >= c){
    a = c;
}
    System.out.print("Small age =" + a);
    
    
}
}
