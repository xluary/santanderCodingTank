package aula;

import java.util.Scanner;

public class Aula02 {
	public static void main (String args[]) {
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Digite o salário do funcionário: ");
		float salario= entrada.nextFloat();
		System.out.println("Digite o código do cargo (1- Técnico, 2 - Gerente, 3- Demais): ");
		int cargo = entrada.nextInt();
		entrada.close();
		
		int erro=0;
		
		switch (cargo) {
		case 1:
			salario *= 1.5f;
			break;
			
		case 2:
			salario *= 1.3f;
			break;
			
		case 3:
			salario *= 1.2f;
			break;	
			
		default:	
			erro = 1;
			System.out.println("Digite um código válido (1,2,3)!");
		};
		
		if (erro==0) {
		System.out.printf("O salário é: R$ %.2f", salario);		
		}
	}
}
