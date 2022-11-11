import java.util.Scanner;
public class IdadePessoa {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int idade, idadeMaior=-1, idadeMenor=1000, i=1;
		do {
			System.out.println("Digite a idade do "+i+"° usuário:");
			idade=ler.nextInt();
			if(idade>idadeMaior) {
				idadeMaior=idade;
			}else if(idade<idadeMenor){
				idadeMenor=idade;
			}
			i++;
		}while (i<=10);
		System.out.println("A idade mais velha é "+idadeMaior+" anos, e a idade mais novo é "+idadeMenor+" anos");
		ler.close();
	}
}
