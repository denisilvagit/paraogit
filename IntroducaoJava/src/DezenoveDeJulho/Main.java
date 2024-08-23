package DezenoveDeJulho;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		//Criando um objeto do tipo LinkedList
		LinkedList<String> nomeCachorro = new LinkedList<String>();
		
		//adicionando elemento à minha LinkedList
		nomeCachorro.addFirst("Kruskal");
		nomeCachorro.addLast("Lindolfo");
		nomeCachorro.add(1, "Uhura");
		
		//Apresentando a minha LinkedList
		System.out.println(nomeCachorro);
		
		//Acessando valores especificados na minha LinkedList
		System.out.println("Primeiro nome " + nomeCachorro.getFirst());
		System.out.println("último nome " + nomeCachorro.getLast());
		System.out.println("Cachorro 2 " + nomeCachorro.get(1));
		
		//remover o primeiro valor da LinkedList
		nomeCachorro.removeFirst();
		System.out.println();
		System.out.println(nomeCachorro);
		
		//Pegar o tamanho da LinkedList
		System.out.println("Tamanho do LinkedList " + nomeCachorro.size());
		
		//Limpar a LinkedList
		nomeCachorro.clear();
	}

}
