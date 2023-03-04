package Sorv;

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