package aula;

import java.util.Scanner;

public class Aula04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float [] notas = new float[10];
		float [] codigos = new float [] {1,2,3,4,5};
		
		for (int i=0; i<notas.length; i++) {
			System.out.printf("Digite a %d notas: ", i+1);
			notas[i]= scan.nextFloat();
		}
		
		for (int i=0; i<notas.length; i++) {
			System.out.println(notas[i]);
		}
		
	}
}
