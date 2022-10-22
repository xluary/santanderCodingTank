package aula;

import java.time.LocalDate;
import java.util.Scanner;

public class Aula01 {
	public static void main (String args[]) {
		String frase1 = "Bem-vindo(a), ";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println(frase1 + nome);
		System.out.println("Agora, digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.println("Seja bem-vindo(a), "+ nome + " " + sobrenome);
		System.out.println("Agora, digite o seu ano de nascimento: ");
		int dataInicial = entrada.nextInt();
		int anoAtual = LocalDate.now().getYear();	
		int idadeFinal = anoAtual - dataInicial;
		System.out.println("Sua idade "+ idadeFinal);
		entrada.close();
	}
}
