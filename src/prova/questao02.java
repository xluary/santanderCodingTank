package prova;

import java.util.Random;
import java.util.Scanner;

public class questao02 {
	 public static void main(String[] args) {
	        int[][] matriz = montarEPreencherQuadrado();
	        
	        int[] somaLinha = somarLinha(matriz);
	        boolean igualdadeLinha = conferirIgualdade(somaLinha);
	        
	        int[] somaColuna = somarColuna(matriz);
	        boolean igualdadeColuna = conferirIgualdade(somaColuna);
	        
         int somaPrimeiraDiagonal = somarPrimeiraDiagonal(matriz);
	        int somaSegundaDiagonal = somarSegundaDiagonal(matriz);
	        String resultadoBom = "A matriz é perfeita";
	        String resultadoRuim = "A matriz não é perfeita";
	        
	       	if (igualdadeColuna == true && igualdadeLinha ==true) {
	       		int [] vetorFinal = new int [] {somaLinha[1], somaColuna[1],somaPrimeiraDiagonal,somaSegundaDiagonal};
	       		boolean conferirFinal = conferirIgualdade(vetorFinal);
	       		if (conferirFinal == true) {
	       			System.out.println(resultadoBom);
	       		} else {
	       			System.out.println(resultadoRuim);
	       		} 
	       	} else {
	        	System.out.println(resultadoRuim);
	        }
	       	
	    }

	    public static int[][] montarEPreencherQuadrado() {

	        Random random = new Random();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Informe o tamanho do quadrado desejado:");
	        int tamanho = scanner.nextInt();
	        int[][] matriz = new int[tamanho][tamanho];
	        for (int linha = 0; linha < matriz.length; linha++) {
	            int[] colunas = matriz[linha];
	            for (int coluna = 0; coluna < colunas.length; coluna++) {
	                int valorAleatorio = random.nextInt(0, 1000);
	                colunas[coluna] = valorAleatorio;
	                System.out.print("[" + valorAleatorio + "]");
	            }
	            System.out.println();
	        }
	        return matriz;
	    }

	    public static int[] somarLinha(int[][] matriz) {
	    	int dimensao = matriz.length;
	    	int [] somaLinha = new int [dimensao];
	    	
	    	for (int i=0; i<dimensao; i++) {
	    		int soma=0;
	    		for (int j=0; j<dimensao; j++) {
	    			int valor = matriz[i][j];
		    		soma+=valor;
		    	}
	    		somaLinha[i]=soma;
	    			    		
	    	}
	    	return somaLinha;	    	
	    }

	    public static int[] somarColuna(int[][] matriz) {
	    	int dimensao = matriz.length;
	    	int [] somaColuna = new int [dimensao];
	    	
	    	for (int i=0; i<dimensao; i++) { //linha 
	    		int soma=0;
	    		for (int j=0; j<dimensao; j++) { //coluna
	    			int valor = matriz[j][i];
		    		soma+=valor;
		    	}
	    		somaColuna[i]=soma;
	    		
	    	}
	    	return somaColuna;	    	
	    }
	    
	    public static int somarPrimeiraDiagonal(int[][] matriz) {
	    	int dimensao = matriz.length;
	    	int somaPrimeiraDiagonal;
	    	int soma=0;
	    	for (int i=0; i<dimensao; i++) { //linha 	    		
	    		for (int j=0; j<dimensao; j++) { //coluna
	    			if (i==j) {
	    				int valor = matriz[i][j];	    				
	    				soma+=valor;
	    			}		    		
		    	}	    		    		
	    	}
 		somaPrimeiraDiagonal=soma;
	    	return somaPrimeiraDiagonal;	    	
	    }
	    
	    public static int somarSegundaDiagonal(int[][] matriz) {
	    	int dimensao = matriz.length;
	    	int somaSegundaDiagonal;
	    	int soma=0;
	    	for (int i=0; i<dimensao; i++) { //linha 	    		
	    		for (int j=dimensao-1; j>=0; j--) { //coluna	   
	    			if (i+j==dimensao-1) {
	    				int valor = matriz[i][j];
	    				soma+=valor;	
	    			}
		    	}	    		    		
	    	}
	    	somaSegundaDiagonal=soma;
	    	return somaSegundaDiagonal;	    	
	    }
	    
	    public static boolean conferirIgualdade(int[] soma) {
	    	int dimensao = soma.length;
	    	int controle=0;	    	
	    	for (int i = 0; i<dimensao; i++){
	    		int proximo = i+1;
	    		if (proximo > dimensao-1){
	    			proximo=1;
	    		}
	    		if (soma[i] == soma[proximo]) {
	    			controle++;
	    		}	    	
	    	}
	    	if (controle == dimensao){
	    		return true;
	    	} else {
	    		return false;
	    	}
	    }

	    public static void printarVetor(int vetor[]) {
	    	int quantidade= vetor.length;
	    	for (int i=0; i<quantidade; i++) {
	    		System.out.print(vetor[i] + " ");
	    	}		
	    }
	   
}
