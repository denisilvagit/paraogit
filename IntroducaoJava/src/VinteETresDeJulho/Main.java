package VinteETresDeJulho;

public class Main {

	public static void main(String[] args) {
		
		Engenheiro engenheiro = new Engenheiro("Eduardo", 12000, 1927, 75, 25, 34562, "Junior", "Eng. Eletricista");
		System.out.println("Salario engenheiro " + engenheiro.calcularSalario(1000, 500));
		
		Advogado advogado = new Advogado("Eliel", 5000, 73534, 78, 26, 374894, "Comarca de Icó");
		System.out.println("Salario A " + advogado.calcularSalario(300, 200));
		
	}

}
