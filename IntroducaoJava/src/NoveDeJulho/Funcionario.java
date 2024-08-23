package NoveDeJulho;

public class Funcionario {
	String nome;
	double altura;
	int idade;
	String endereco;
	double salario;
	
	public Funcionario(String nome, 
			double altura, int idade,
			String endereco, double salario) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		this.endereco = endereco;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double apresenteSalario(double salario) {
		double salariofinal = (salario) + (salario*0.08) * 12;
		System.out.println("O salário final é " + salariofinal);
		return salariofinal;
	}
	
	public void apresentarMaiorOuMenor(int idade) {
		if(idade >= 18) {
			System.out.println("Funcionário Maior de Idade");
		}else {
			System.out.println("Funcionário menor de Idade");
		}
	}
	
	public double retornarValorTransporte(double passagem) {
		double valor = passagem * 31;
		System.out.println("O valor a ser pago é " + valor);
		return valor;
	}
	
	public double retornarDiferencaEntreAltura(double alt1, double alt2) {
		double dif = alt1 - alt2;
		System.out.println("A diferença é " + dif);
		return dif;
	}
	
}
