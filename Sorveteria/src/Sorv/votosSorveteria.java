package Sorv;

/*		O código encontra o número mais frequente em um array usando um Map. 
	Eple começa definindo um array de votos e chama a função numeroMaisFrequente() 
	ara encontrar o número de sorvete mais votado.

		A função numeroMaisFrequente() itera pelos votos, mantém uma contagem do número de vezes que cada 
	número aparece usando um TreeMap e,a cada iteração, verifica se o número atual tem uma contagem maior
	do que o número de contagem atual. Se sim, o número mais frequente é atualizado para o novo número
	e a contagem é atualizada. Se houver um empate, o número mais baixo é selecionado. Por fim, a função
	retorna o número mais frequente encontrado.
*/

import java.util.Map;
import java.util.TreeMap;


public class votosSorveteria {

		   public static void main(String[] args) {	   
		        int[] votos = {1, 1, 3, 4, 4, 4};
		        int numeroMaisFrequente = numeroMaisFrequente(votos);
		        System.out.println("O sorvete mais votado foi o de número: " + numeroMaisFrequente);
		    }
		   
		    
		    public static int numeroMaisFrequente(int[] votos) {
		        Map<Integer, Integer> contagem = new TreeMap<>();
		        int numeroMaisFrequente = -1;
		        int contagemNumeroMaisFrequente = 0;
		        for (int i = 0; i < votos.length; i++) {
		            int numero = votos[i];
		            int novaContagem = contagem.getOrDefault(numero, 0) + 1;
		            contagem.put(numero, novaContagem);
		            if (novaContagem > contagemNumeroMaisFrequente 
		                    || (novaContagem == contagemNumeroMaisFrequente && numero < numeroMaisFrequente)) {
		                numeroMaisFrequente = numero;
		                contagemNumeroMaisFrequente = novaContagem;
		            }
		        }
		        return numeroMaisFrequente;
		    }
		}