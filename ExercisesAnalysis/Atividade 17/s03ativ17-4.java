import java.util.Scanner;
public class s03ativ17{
public static void main(String[] args) {
	
Scanner e = new Scanner(System.in);
double sal,fi,ssal=0,sfi=0,s=0,f=0,m=0,smil=0,perc,msal,mfi;
		
sal = e.nextDouble();
while (sal>0){
 if (sal>m){
 m = sal;
}
 if (sal<=1000){
 smil = smil+1;
	}
	 ssal=ssal+sal;
	 s=s+1;
	 fi = e.nextDouble();
	 while (fi<0){
	 System.out.println( "Erro: Redigite numero de filhos!");
	 fi = e.nextDouble();
	 }
	 sfi=sfi+fi;
	 f=f+1;
	 sal = e.nextDouble();
	}
	if(sal !=0){
	 msal = ssal/s;
	 mfi=sfi/f;
	 perc = (smil/s)*100;
	 System.out.println("Media Salario = " + msal);
	 System.out.println("Media Numero de Filhos = " + mfi);
	 System.out.println("Maior Salario = " + m);
	 System.out.println("Percentual Pessoas com salario ate 1000 reais = "+ perc+ "%");
		}
		else{
			if (sal == 0){
	System.out.println("Media Salario = " + sal);
	System.out.println("Media Numero de Filhos = " + sal);
	System.out.println("Maior Salario = " + sal);
	System.out.println("Percentual Pessoas com salario ate 1000 reais = "+ sal+ "%");
			}
		}
	}
}