package VinteEQuatroDeJulho;
public class Professor implements IProfissao{
	@Override
	public double calcularSalario(double salarioBruto, double imposto, double gratificacao) {
		double salarioFinal = (salarioBruto - 1.5*imposto) + gratificacao;
		System.out.println("O salário final do Professor é: " + salarioFinal);
		return salarioFinal;
	}
	@Override
	public double calcularHorasTrabalhadas(double dia, double hora) {
		double horasTrabalhadas = (5.25 * hora) * dia;
		System.out.println("A quantidade de horas trabalhadas são " + horasTrabalhadas);
		return horasTrabalhadas;
	}
	@Override
	public double calcularINSS(double salarioBruto, double faixaImposto) {
		double inssFinal = salarioBruto - (salarioBruto * faixaImposto/100);
		System.out.println("O INSS Final é " +  inssFinal);
		return inssFinal;
	}

}
