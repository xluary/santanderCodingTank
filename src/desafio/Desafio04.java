package desafio;

import java.util.Scanner;

public class Desafio04 {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de linhas: ");	
		int linhas= entrada.nextInt();
		
		for (int x=linhas; x>0; x--) {				
			for (int y=0; y<x; y++) {
				System.out.print("*");	
			}
			System.out.print("\n");	
		}
	}
}
