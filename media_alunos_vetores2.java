package jojopose;
import java.util.Scanner;
public class media_alunos_vetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		// Declaracao das variaveis 
        int soma = 0, q[] = {35,4,22,20,36,30};
        int maior = 0;
        float media = 0;

        // Estrutura de repeticao numero de alocamentos do vetor
        for(int i =0; i < q.length; i++) {
            // Somar os valores do vetor e guardar na variavel soma
            soma = soma + q[i];
            // Dividir o valor somado pelo numero de alocamentos do vetor (6)
            media = soma / q.length;

            // Estrutura de decisao valor de um vetor maior que media
            if (q[i] > media) {
                // Variavel maior receber valor do vetor
                maior = q[i];
            }
        }
        // Exibir ao usuario a media dos alunos 
        System.out.printf("A media de alunos é: %f\n", media);
        // Exibir ao usuario a maior quantidade de alunos
        System.out.printf("A maior quantidade de alunos é: %d", maior);
    }



	}


