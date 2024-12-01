// Note que a classe deve se chamar s03ativ17
// Exclua ou comente a linha do "package"
// Lembre-se de "comentar" as intruÃ§Ãµes de System.out.print que  nÃ£o fazem parte da SAÃ?DA de ** RESULTADOS ** especificada
import java.util.Scanner;
class s03ativ17 {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        
        double S;
        double somaS;
        double F;
        double somaF;
        double total;
        double mediaS;
        double mediaF;
        double porcentagem;
        double mediaporcentagem;
        
        total = 1;
        somaS = 0;
        somaF = 0;
        porcentagem=0;
        
        S = 1;
        while (S<=0)
        {
            S = input.nextDouble();
            F = input.nextDouble();
            while (F<0)
            {
                System.out.println("Erro: Redigite numero de filhos!");
                F = input.nextDouble();
            }
            if (S>=0)
            {
                if (S<=1000)
                {
                porcentagem = porcentagem+1;
                }
                somaS += S;
                somaF += F;
                total += 1;
            }
        }
        mediaS=somaS/(total-1);
        mediaF=somaF/(total-1);
        mediaporcentagem=porcentagem*100/(total-1);
        System.out.println("Media Salario = "+mediaS);
        System.out.println("Media Numero de Filhos = "+mediaF);
        System.out.println("Percentual Pessoas com salario ate 1000 reais = "+mediaporcentagem+"%");
    }
}
