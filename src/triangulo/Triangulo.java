package triangulo;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		double l1, l2, l3, co1, co2, co3;
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o tamanho do primeiro lado:");
		l1 = ler.nextDouble();
		System.out.print("Digite o tamanho do segundo lado:");
		l2 = ler.nextDouble();
		System.out.print("Digite o tamanho do terceiro lado:");
		l3 = ler.nextDouble();
		ler.close();
		
		co1= l1+l2;
		co2= l3+l2;
		co3= l1+l3;

		if (co1>l3 && co2>l1 && co3>l2) {
			
			if  (l1 == l2 && l1 == l3 && l2==l3){
				
				System.out.println("e o triangulo é um triangulo equilátero");
			
			} else if (l1 != l2 && l1 != l3 && l2 != l3) {

				System.out.println("e o triangulo é um triangulo escaleno");
			
			} else {
				System.out.println("e o triangulo é um triangulo isósceles");
			
			}

		} else {
			
			System.out.println("o valor não forma um triangulo");

		}
	}
}
