package jojopose;
import java.util.Scanner;
public class media_alunos_vetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in); // Nosso Scanner que fara a leitura do codigo
		
		 
        int soma = 0, q[] = {35,4,22,20,36,30}; // Nossas Variaveis 
        int maior = 0; // Nossa variavel
        float media = 0; // Nossa Variavel

        
        for(int i =0; i < q.length; i++) { // Nossa estrutura de repeticao junto com as instancias do vetor
            
            soma = soma + q[i]; // Nosso calculo de soma 
            
            media = soma / q.length; // Dividindo o valor pelo numero de instancias do vetor 

           
            if (q[i] > media) { // Nossa estrutura de decisao
                
                maior = q[i]; // Nossa maior variavel recebe o valor do vetor
            }
        }
        
        System.out.printf("A media de alunos é: %f\n", media); // Interface que ira aparecer para o usuario com os resultados 
        System.out.printf("A maior quantidade de alunos é: %d", maior); // Interface que ira aparecer para o usuario com os resultados
    }



	}


