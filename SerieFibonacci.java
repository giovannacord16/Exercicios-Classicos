import java.util.Scanner;
public class SerieFibonacci {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int n, termo1=0, termo2=1, i=1, proximoTermo=1;
		System.out.println ("Digite quantos termos você quer ver da série de Fibonacci:");
		n=ler.nextInt();
		do {
			System.out.println (proximoTermo);
			proximoTermo=termo1+termo2;
			termo1=termo2;
			termo2=proximoTermo;
			i++;
		}while (i<=n);
		ler.close();
	}
}
