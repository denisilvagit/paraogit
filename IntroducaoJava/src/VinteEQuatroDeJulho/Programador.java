package VinteEQuatroDeJulho;

public class Programador implements IProfissao {

	@Override
	public double calcularSalario(double salarioBruto, double imposto, double gratificacao) {
		double salarioFinal = (salarioBruto - imposto) + (gratificacao);
		System.out.println("O salario final do Programador é " + salarioFinal);
		return salarioFinal;
	}

	@Override
	public double calcularHorasTrabalhadas(double dia, double hora) {
		double horasTrabalhadas = (dia * hora) + dia/hora;
		System.out.println("As horas trabalhadas são " + horasTrabalhadas);
		return horasTrabalhadas;
	}

	@Override
	public double calcularINSS(double salarioBruto, double faixaImposto) {
		double inssFinal = salarioBruto - faixaImposto/100;
		System.out.println("O INSS final é " + inssFinal);
		return inssFinal;
	}

}
