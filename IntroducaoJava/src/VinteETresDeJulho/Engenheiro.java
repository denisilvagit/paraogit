package VinteETresDeJulho;

public class Engenheiro extends Funcionario{

	Integer CREA;
	String nivel;
	String area;
	
	public Engenheiro(String nome, double salario, Integer matricula, double peso, int idade,
			Integer CREA, String nivel, String area) {
		super(nome, salario, matricula, peso, idade);
		// TODO Auto-generated constructor stub
		this.CREA = CREA;
		this.nivel = nivel;
		this.area = area;
	}

	public Integer getCREA() {
		return CREA;
	}

	public void setCREA(Integer cREA) {
		CREA = cREA;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}


}
