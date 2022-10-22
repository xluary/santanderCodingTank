package prova;

import java.util.Scanner;

public class questao01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o tamanho da pirâmide: ");
		int tamanho = entrada.nextInt();
		int itensLinha= 2 * tamanho - 1;
		System.out.println(itensLinha);
		int controle=1;
				
		for (int i=0; i<tamanho; i++) {			
			int quantidadeH=controle;			
			int quantidadeT=((itensLinha-controle)/2);	
			
			printarT(quantidadeT);
			printarH(quantidadeH);
			printarT(quantidadeT);
//				}
			System.out.println();	
			controle = controle + 2;
		}

		}
	
		public static void printarT(int quantidade) {
			for (int i=0; i<quantidade; i++) {
				System.out.print("-");
			}
		}
		
		public static void printarH(int quantidade) {
			for (int i=0; i<quantidade; i++) {
				System.out.print("#");
			}
		}
}
