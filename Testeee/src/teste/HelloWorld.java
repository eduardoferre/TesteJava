package teste;

import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Hello, World!");
		
		int n1;
		System.out.print("Digite um numero: ");
		n1 = scanf.nextInt();
		System.out.println("Numero digitado: "+n1);
		
		
		double a1, a2, a3;
		System.out.print("Digite a altura do primeiro atleta: ");
		a1 = scanf.nextDouble();
		System.out.print("Digite a altura do segundo atleta: ");
		a2 = scanf.nextDouble();
		System.out.print("Digite a altura do terceiro atleta: ");
		a3 = scanf.nextDouble();
		
		double media;
		
		media = (a1 + a2 + a3) / 3;
		
		System.out.println("\nMédia da aultura dos atletas: "+media);
		
		System.out.println("Testando commit!");
		
		System.out.println("Testando Segundo commit!");
		
		scanf.close();
		
		double a11 = 1.58;
		double a22 = 2.07;
		double a33 = 0.55;
		
		double media1 = (a11+a22+a33) / 3;
		
		System.out.println(media1);
		
		
		
	}

}
