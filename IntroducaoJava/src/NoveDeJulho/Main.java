package NoveDeJulho;

public class Main {

	public static void main(String[] args) {
		
		Funcionario marcos = new Funcionario("Marcos", 1.59, 51, "Av. 112", 98657);
		marcos.apresenteSalario(marcos.getSalario());
		
		Funcionario joaoPaulo = new Funcionario("João Paulo", 1.64, 17, "Av. 5", 600);
		joaoPaulo.apresentarMaiorOuMenor(joaoPaulo.getIdade());
		
		Funcionario luan = new Funcionario("Luan", 1.68, 25, "Rua Jovita Feitosa", 4600);
		luan.retornarValorTransporte(12);
		
		Funcionario eduardo = new Funcionario("Eduardo", 1.76, 21, "Rua do Assalto", 9000);
		Funcionario maria = new Funcionario("Luan", 1.67, 19, "Rua Alberto Craveiro", 10000);

		eduardo.retornarDiferencaEntreAltura(eduardo.getAltura(), maria.getAltura());
	}

}
