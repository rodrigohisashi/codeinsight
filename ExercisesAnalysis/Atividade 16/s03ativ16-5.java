import java.util.Scanner;
public class s03ativ16 {
    public static void main(String[] args) {
        int n,menor;
        menor= 0;
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        int[] idade = new int[n];
        for(int i = 0; i<n;i++){
                while (idade[i] < 0) {
                    i = i -1;
                    System.out.println("Erro: Redigite idade!\n");
                }

            idade[i] = teclado.nextInt();
            if (idade[i] >= idade[0] && idade[i]>0 && idade[0]>0) {
                menor = idade[0];
            }
            if(idade[0]>idade[i] && idade[i]>0 && idade[0]>0){
                idade[0] = idade[i];
                menor = idade[0];
            }
        }
        System.out.println("Menor idade = "+menor);
        }
    }