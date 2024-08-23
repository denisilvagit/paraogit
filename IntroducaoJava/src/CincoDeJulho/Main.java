package CincoDeJulho;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
//		Pessoa eduardo = new Pessoa("Eduardo", 18, 1.75);
//		System.out.println(eduardo.getNome());
//		eduardo.setNome("Eduardo Vieira");
//		System.out.println(eduardo.getNome());
//		eduardo.apresentarSalario(5000);
//		Pessoa joaoPaulo = new Pessoa("João Paulo", 19, 1.69);
//		System.out.println(joaoPaulo.getNome());
//		joaoPaulo.apresentarSalario(7000);
		
//		Mensagem simples
		
//		Pessoa luan = new Pessoa("Luan", 23, 1.74);
//		
//		JOptionPane.showMessageDialog(
//				null, 
//				"Nome : " + luan.getNome() + "\n" +
//				"Idade : " + luan.getIdade() + "\n" +
//				"Altura : " + luan.getAltura(), 
//				"INFORMAÇÕES DA PESSOA",
//				JOptionPane.WARNING_MESSAGE);
		
		String nome = JOptionPane.showInputDialog(
				null,
				"Qual é seu nome",
				"Entrada de dados",
				JOptionPane.QUESTION_MESSAGE
		);
		String idade = JOptionPane.showInputDialog(
				null,
				"Qual é sua idade",
				"Entrada de dados",
				JOptionPane.QUESTION_MESSAGE
		);
		int idadeFinal = Integer.parseInt(idade); 
		
		String altura = JOptionPane.showInputDialog(
				null,
				"Qual é sua altura",
				"Entrada de dados",
				JOptionPane.QUESTION_MESSAGE
		);
		double alturaFinal = Double.parseDouble(altura);
		int resposta = JOptionPane.showConfirmDialog(
				null, 
				"Você deseja continuar?",
				"Confirmação",
				JOptionPane.YES_NO_CANCEL_OPTION
		);
		//SIM - 0 //NÃO - 1 //CANCELAR - 2
		if (resposta == 0) {
			Pessoa maria = new Pessoa(nome, idadeFinal, alturaFinal);
			JOptionPane.showMessageDialog(
					null, 
					"Nome : " + maria.getNome() + "\n" +
					"Idade : " + maria.getIdade() + "\n" +
					"Altura : " + maria.getAltura(), 
					"INFORMAÇÕES DA PESSOA",
					JOptionPane.WARNING_MESSAGE
			);
		}
		
		
	}

}
