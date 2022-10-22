package desafio;

import java.util.Scanner;

public class Desafio03 {
	static Scanner entrada = new Scanner(System.in);
	
	
	public static void main (String args[]) {
		
		System.out.print("Digite o salário mensal: ");		
		float salario = entrada.nextFloat();		
		salario= aumentarSalario(salario);		
		
		float salarioAnual= calcularSalarioAnual(salario);
		float tercoFerias = calcularTercoFerias(salario);
		float salarioBruto = calcularSalarioBruto (salarioAnual,tercoFerias);
		float inss = calcularINSS(salario, salarioBruto);		
		calcularSalarioLiquido (salarioBruto, inss);
	}
	
	public static float aumentarSalario (float salario) {
		int cargo;
		
		do  {
			System.out.print("Digite o código do cargo (1- Técnico, 2 - Gerente, 3- Demais): ");
			cargo = entrada.nextInt();
		}  while (cargo < 1 || cargo > 3 );
			
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
		};
		
		System.out.printf("\nSalário alterado: R$ %.2f \n", salario);		
		
		return salario;
	}
	
	public static float calcularSalarioAnual(float salario) {
		float total = (salario*13);
		System.out.printf("Salário anual (considerando o décimo terceiro): R$ %.2f \n", total);
		return total;
	}
	
	public static float calcularTercoFerias(float salario) {
		float terco= salario/3;
		System.out.printf("Terço de férias: R$ %.2f \n", terco);		
		return terco;
	}
	
	public static float calcularSalarioBruto(float salarioAnual, float tercoFerias) {
		float salarioBruto= salarioAnual + tercoFerias;
		System.out.printf("Salário bruto: R$ %.2f \n", salarioBruto);
		return salarioBruto;
	}
	
	public static float calcularINSS(float salario, float salarioAnual) {
		float aliquota = 0;
		float teto = 0;
		
		if (salario <= 1212) {
			aliquota = 0.075f;
		} else if (salario >1212 && salario <= 2427.35) {
			aliquota = 0.09f;
		} else if (salario > 2427.35 && salario <= 3641.03) {
			aliquota = 0.12f;
		} else if (salario > 3641.03 && salario <= 7087.22) {
			aliquota = 0.14f;
		} else {
			teto = 900f*13; //para cada um dos meses (incluído o 13)
		}
		
		float inss= salarioAnual*aliquota+teto;	
		System.out.printf("O valor do INSS total: R$ %.2f \n", inss);	
		return inss;
	}
	
	public static void calcularSalarioLiquido(float salarioBruto, float inss) {
		float salarioLiquido = salarioBruto - inss;
		System.out.printf("Salário anual líquido: R$ %.2f \n", salarioLiquido);
		
	}
}
