package OitoDeJulho;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String nomeCachorro = JOptionPane.showInputDialog(
				null,
				"Digite seu nome",
				"Entrada de dados",
				JOptionPane.QUESTION_MESSAGE
		);
		int resposta = JOptionPane.showConfirmDialog(
				null,
				"Você quer manter o nome : " + nomeCachorro + " ? ",
				"Confirmação",
				JOptionPane.YES_NO_CANCEL_OPTION
		); 
		if(resposta == 0) {
			Mamifero cachorro = new Mamifero(nomeCachorro, 0.45, 3);
			JOptionPane.showMessageDialog(
					null, 
					"Cuidado com o " + cachorro.getNome(),
					"Cuidado com o cão",
					JOptionPane.WARNING_MESSAGE
			);
		}
//		cachorro.apresentarNomeAnimal();
//		cachorro.classificarAnimal(0);
//		cachorro.classificarAnimalPorIdade(3);
//		
		
		
		System.out.println();
		
		Mamifero gato = new Mamifero("Xane", 0.20, 10);
//		gato.apresentarNomeAnimal();
//		gato.classificarAnimal(0);
//		gato.classificarAnimalPorIdade(21);
	}

}
