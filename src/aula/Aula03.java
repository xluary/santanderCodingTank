package aula;

import java.util.Scanner;

public class Aula03 {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: ");
		float x = entrada.nextFloat();
		
		System.out.println("Digite o valor de y: ");
		float y = entrada.nextFloat();
		
		if (x==0 || y==0) {
			System.out.printf("O valor está sobre um dos eixos"); 
		} else if (x>0) {
			if (y>0) {
				System.out.printf("O ponto está no quadrante B");
			} else {
				System.out.printf("O ponto está no quadrante C");
			}
		} else {
			if (y>0) {
				System.out.printf("O ponto está no quadrante A");
			} else {
				System.out.printf("O ponto está no quadrante D");
			}
		}	
	}
}
