package DezoitoDeJulho;

import java.util.HashMap;
import java.util.Scanner;

//Implemente um método que recebe um HashMap de
//produtos (chave: nome do produto, valor: preço) e um valor
//limite. O método deve retornar uma lista de produtos que
//têm preços abaixo do valor limite.

public class HashMapExercise {
	public void inserirInformacoesValidas(int limite) {
		HashMap<String, Double> hashMap = new HashMap<>();
		double preco = 0;
		Scanner entradaProduto = new Scanner(System.in);
		Scanner entradaPreco = new Scanner(System.in);
		while(preco < limite) {
			System.out.println("Insira o nome do produto");
			String produto = entradaProduto.nextLine();
			System.out.println("Insira o preço do produto");
			preco = entradaPreco.nextFloat();
			if(preco < limite) {
				hashMap.put(produto, preco);
				System.out.println(hashMap);
			}else {
				System.out.println("Valor informado inválido");
			}
		}
		entradaPreco.close();
		entradaProduto.close();
	}

}
