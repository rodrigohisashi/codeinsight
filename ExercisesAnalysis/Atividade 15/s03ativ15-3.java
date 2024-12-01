import java.util.Scanner;
 
public class s03ativ15{
public static void main(String[] args) {
 
Scanner entrada = new Scanner(System.in);
int n, m, c= 0, nulo=0, d=0, nd=0;
n = entrada.nextInt();
System.out.print("N:");
while ( n > c){
    m = entrada.nextInt();
    System.out.print("m:");
    
    System.out.print("m");
        if (m==0){
            nulo = nulo + 1;
        }
        else if (m%3 == 0){
            d = d +1;
        }
        else if (m%3 != 0){
            nd = nd + 1;
        }
        c = c +1;
        System.out.print("Nulos=" + nulo);
        System.out.print("Divisiveis=" + d);
        System.out.print("Nao divisiveis=" + nd);
        
}
}
}

