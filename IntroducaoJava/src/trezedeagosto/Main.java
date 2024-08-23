package trezedeagosto;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		List<String> estados = Arrays.asList("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um estado (UF): ");
		String uf = sc.nextLine();
		if (estados.contains(uf)) {
			System.out.println("É um estado brasileiro!");
		} else {
			System.out.println("Não é um estado brasileiro");
		}
		System.out.println("Digite seu cpf:");
		String cpf = sc.nextLine();
		Validacpf val = new Validacpf();
		if (val.isCpf(cpf) == true) {
			System.out.println(cpf);
		} else {
			System.out.println("CPF inválido!");
		}

	}

}
