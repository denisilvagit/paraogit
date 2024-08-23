package DezesseisDeJulho;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		//Declaração da lista
		List<String> list = new ArrayList<>();
		
		//Adicionar elementos à lista
		list.add("Marcos Mahalanobis");
		list.add("João Paulo II");
		list.add("Eliel Sousa");
		list.add("Luciano Cavalcante");
		list.add("Edward Snowden");
		list.add("Maria de Jesus");
		//adicionando um elemento de acordo com o índice
		list.add(1, "Leo");

		//Recuperar ou apresentar o último elemento da lista
		//System.out.println(list.get(5));
		
		//Apresentar o objeto lista completo
		//System.out.println(list);
		
		//for tradicional
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println("Elemento: " + list.get(i) 
//			+ " Posição: " + i);
//		}
				
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println("Elemento: " + list.get(i) 
//			+ " Posição: " + i);
//		}
		//for each
//		for(String elemento : list) {
//			System.out.println("Elemento: " + elemento);
//		}
		
//		System.out.println(list);
		//remove elemento por índice
//		list.remove(0);
//		System.out.println(list);
		//remove por elemento
//		list.remove("Leo");
//		System.out.println(list);
//		//Atualização de elementos da lista
//		list.set(1, "Leonardo");
//		System.out.println(list);
//		//pega um elemento da lista
//		String nomeLeo = list.get(1);
//		System.out.println(nomeLeo);
		
		//Retornar o índice da primeira ocorrência
//		int primeiroValorEncontrado = list.indexOf("Maria de Jesus");
//		System.out.println("Primeiro " + primeiroValorEncontrado);
//		
		//Retornar o índice da última ocorrência
//		int ultimoValorEncontrado = list.lastIndexOf("Eliel Sousa");
//		System.out.println("último " + ultimoValorEncontrado);
		// Pega o tamanho da lista
		int sizeList = list.size();
		System.out.println("O tamanho da lista é : " + sizeList);
		// Verifica se a lista está vazia ou não
		boolean isListEmpty = list.isEmpty();
		System.out.println("A lista está vazia "+ isListEmpty);
		//Cria uma sublista a partir de uma lista
		List<String> subList = list.subList(2, 4);
		System.out.println(subList);
		//Verifica se o valor passado está na lista
		boolean contains = list.contains("Eliel Sousa");
		System.out.println("Contains " + contains);
		

	}
}
