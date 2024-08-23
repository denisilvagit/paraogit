import java.util.Scanner;

public class Calculadora {

	public  void mostraValorPar(int n) {
		for (int i = n; i > 0; i--) {
			if (i % 2 == 0) {
				System.out.println("Número par: " + i);
			}
		}
	}

	public void mostraValorImpar(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.println("Número ímpar: " + i);
			}
		}
	}

	public void apresentarFrase(int n) {
		int i = n;
		while (i != 0) {
			System.out.println("Hello World");
			i--;
		}
	}

	public int somarNumeros(int n) {
		int i = 0;
		int soma = 0;
		while (i <= 100) {
			soma = soma + i;
			i++;
		}
		System.out.println("O valor da soma é: " + soma);
		return soma;
	}

	public  double somarIterativamente() {
		Scanner input = new Scanner(System.in);
		double soma = 0;
		double valor = 1;

		while (valor != 0) {
			System.out.println("Insira o valor: ");
			valor = input.nextFloat();
			soma = soma + valor;
		}
		input.close();
		System.out.println("O valor da soma é: " + soma);
		return soma;
	}

	public double multiplicarIterativamente() {
		double mult = 1;
		double valor = 1;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Digite o valor: ");
			valor = input.nextDouble();
			if(valor != 0) {
				mult = mult * valor;
			}else{
				if(mult == 0) {
					System.out.println("teste 1: " + 0);
				}else {
					System.out.println("teste 2: " + mult);
				}
			}

		} while (valor != 0);
		input.close();
		return mult;
	}

}
