import java.util.Scanner;
public class FaixaEtariaPessoas {
	public static void main (String[]args) {
		Scanner ler=new Scanner(System.in);
		int i,idade,qtdd1=0,qtdd2=0,qtdd3=0,qtdd4=0,qtdd5=0, qtddTotal;
		double porcen1,porcen2, porcen3, porcen4, porcen5;
		for (i=1;i<=15;i++) {
			System.out.println("Digite a idade do "+i+"° pessoa:");
			idade=ler.nextInt();
			if(idade<=15) {
				qtdd1=qtdd1+1;
			}else if (idade<=30) {
				qtdd2=qtdd2+1;
			}else if(idade<=45) {
				qtdd3=qtdd3+1;
			}else if(idade<=60) {
				qtdd4=qtdd4+1;
			}else {
				qtdd5=qtdd5+1;
			}
		}
		qtddTotal=qtdd1+qtdd2+qtdd3+qtdd4+qtdd5;
		porcen1=(qtdd1*100)/qtddTotal;
		porcen2=(qtdd2*100)/qtddTotal;
		porcen3=(qtdd3*100)/qtddTotal;
		porcen4=(qtdd4*100)/qtddTotal;
		porcen5=(qtdd5*100)/qtddTotal;
		System.out.println("A quantidade de pessoas na faixa etária de até 15 anos é "+qtdd1+" e sua porcentagem "+porcen1);
		System.out.println("A quantidade de pessoas na faixa etária de 16 anos até 30 anos é "+qtdd2+" e sua porcentagem "+porcen2);
		System.out.println("A quantidade de pessoas na faixa etária de 31 anos até 45 anos é "+qtdd3+" e sua porcentagem "+porcen3);
		System.out.println("A quantidade de pessoas na faixa etária de 46 anos até 60 anos é "+qtdd4+" e sua porcentagem "+porcen4);
		System.out.println("A quantidade de pessoas na faixa etária acima de 61 anos é "+qtdd5+" e sua porcentagem "+porcen5);
		ler.close();
	}
}
