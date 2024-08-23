package VinteETresDeJulho;

public interface IFuncionario {
	
	double calcularSalario(double salario, double imposto, double grat);
	double verQuantidadeHorasTrabalhadas(int horaInicio, int horaFim);
	double verClassificacaoNiveldoProfissional(int anosExperiencia);

}
