package desafio;

import java.util.Scanner;

public class Desafio02 {
	public static void main (String args[]) {
//		calcularMediaSalario();
//		aumentarSalario();
//		calcularINSS();
		calcularTercoFerias();
	}
	
	
	public static void aumentarSalario () {
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
	
	public static void calcularMediaSalario() {
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Digite o salário mensal? ");
		float salario= entrada.nextFloat();
		float media = (salario*13) / 12;
		System.out.printf("%.2f", media);
	}
	
	public static void calcularINSS() {
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Qual o salário mensal? ");
		float salario = entrada.nextFloat();
		float aliquota=0.075f;
		float inss= salario*aliquota;	
		System.out.printf("O valor do INSS é: R$ %.2f", inss);	
		entrada.close();
	}
	
	public static void calcularTercoFerias() {
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Qual o salário mensal? ");
		float salario = entrada.nextFloat();
		float percentual=0.33f;
		float tercoFerias= salario*percentual;	
		System.out.printf("O valor do INSS é: R$ %.2f", tercoFerias);	
		entrada.close();
	}
}
