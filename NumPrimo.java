import java.util.Scanner;
public class NumPrimo {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		int result, num,i=1,qtdd=0;
		System.out.println("Digite o número para saber se ele é primo:");
		num=ler.nextInt();
		do {
			result=num%i;
			if(result==0) {
				qtdd=qtdd+1;
			}
			i++;
		}while(i<=num);
		if(qtdd==2) {
			System.out.println(num+" é primo");
		}else {
			System.out.println(num+" não é primo.");
		}
		ler.close();
	}
}
