package desafio;

import java.util.Scanner;

public class Desafio01 {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o salário mensal? ");
		float salario = entrada.nextFloat();
		float salarioBruto = calcularSalarioBruto(salario);
		float salarioLiquido = descontarINSS(salarioBruto);

		System.out.printf("O salário anual líquido é: R$ %.2f", salarioLiquido);

	}

	public static float calcularSalarioBruto(float salario) {
		float total = ((salario * 13)); // salario total com 13°
		float ferias = salario / 3; // adicional de férias (um terço do salário)
		float bruto = total + ferias;
		return bruto;
	}

	public static float descontarINSS(float salarioBruto) {
		float aliquota = 0.075f;
		float inss = salarioBruto * aliquota;
		float salarioLiquido = salarioBruto - inss;
		return salarioLiquido;
	}
}
