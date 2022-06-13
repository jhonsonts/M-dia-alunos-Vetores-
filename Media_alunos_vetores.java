package jojopose;

import java.util.Scanner;
import java.util.Arrays;

public class Media_alunos_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner ler = new Scanner(System.in); // Nosso Scanner que fara a leitura do codigo
		
		int soma = 0,  q[] = new int[6]; // Nossas variaveis e nosso vetor com valor defifnido
		float media = 0; // Nossa Variavel
		for (int i = 0; i < q.length; i++) { // Nossa estrutura de repeticao para o numero do valor definido no vetor 
			System.out.printf("Digite a quantidade de alunos da Sala %d\n", (i + 1)); // Interface que aparecera para o usuario imputar dados, depois somando +1
			q[i] = ler.nextInt(); // Fara a leitura da String, guardando o valor que foi recebido
			soma = soma + q[i]; // Nosso calculo de soma 
			media = soma / q.length; // Calculo para tirar a media 
		}
		Arrays.sort(q); // Estrutura para ordenar o menor e maior valor do vetor
	
		int maior = q[5]; // Nossa variavel do vetor, maior valor
		int menor = q[0]; // Nossa variavel do vetor, menor valor
		
		System.out.printf("A media de alunos das salas é: %f\n", media); // Interface que ira aparecer para o usuario
		System.out.printf("A sala com mais alunos tem %d alunos\n", maior); // Interface que ira aparecer para o usuario
		System.out.printf("A sala com menos alunos tem %d alunos\n", menor); // Interface que ira aparecer para o usuario
	}


	}


