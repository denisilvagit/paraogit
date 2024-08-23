package DezesseteDeJulho;

import java.util.Vector;

public class ArrayVector {

	public static void main(String[] args) {
		// Criação do array
		int[] numeros = new int[5];

		// preenchimento do array com valores
		for (int i = 0; i < 5; i++) {
			numeros[i] = i + 1;
		}
		// Apresentando as informações do array com foreach
//		System.out.println("Solução usando ForEach");
//		for(int numero : numeros) {
//			System.out.println(numero);
//		}
//		System.out.println("Solução usando For");
//		for(int i = 0; i<5; i++) {
//			System.out.println(numeros[i]);
//		}

		// Criar array com valores predefinidos
		int[] valores = { 10, 20, 30, 40, 50 };

		// Atribuição de valores nas posições do array
//		valores[0] = 0;
//		valores[1] = 0;
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(valores[i]);
//		}

//		int tamanhoArray = valores.length;
//		
//		int primeiraPosicao = valores[0];
//		int ultimaPosicao = valores[tamanhoArray - 1];

//		System.out.println("Primeira posição " + primeiraPosicao 
//				+ " última posição " + ultimaPosicao);

		Vector<String> timeFutebol = new Vector<>();

		timeFutebol.add("Ferroviário");
		timeFutebol.add("Fortaleza");
		timeFutebol.add("Ceará");
		timeFutebol.add("Barcelona");
		timeFutebol.add("Novo Horizontino");

//		for (String time : timeFutebol) {
//			System.out.println(time);
//		}
		int tamanho = 5;
		//Criando Vector
		Vector<Double> salarios = new Vector<>(tamanho);
		//Adicionando valores ao Vector
		salarios.add(1284.90);
		salarios.add(1456.89);
		salarios.add(3456.50);
		salarios.addElement(5000.6);
		salarios.add(0, 9000.4);
		salarios.add(1234.89);
		
//		for (Double salario : salarios) {
//			System.out.println(salario);
//		}
		//Pegando primeira e última posição do vector com get
		Double primeiroElemento = salarios.get(0);
		Double ultimoElmento = salarios.get(salarios.size() -1);

		//Pegando primeira e última posição do vector com 
		// funções nativas do vector
		String firstElemento = timeFutebol.firstElement();
		String lastElemento = timeFutebol.lastElement();
		
		//Alterando valores dentro do Vector
		timeFutebol.set(1, "Leão");
				
		//Removendo valores no Vector
//		timeFutebol.remove(4);
//		timeFutebol.removeElement("Barcelona");
//		timeFutebol.removeAllElements();
//		
		//Pegando tamanho do vector
		int tam = timeFutebol.size();
		System.out.println(tam);
		
		//Verificar se Vector está vazio
		boolean isEmpty = timeFutebol.isEmpty();
		System.out.println(isEmpty);
		
		boolean estarContido = timeFutebol.contains("Ceará");
		System.out.println("Ceará está na lista? " + estarContido);
		
		for (String time : timeFutebol) {
			System.out.println(time);
		}
		
	}

}
