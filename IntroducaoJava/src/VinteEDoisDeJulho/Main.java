package VinteEDoisDeJulho;

public class Main {

	public static void main(String[] args) {

		FuncoesString funcoesString = new FuncoesString();
		
		funcoesString.iniciarStringManeiraUm("Luciano Cavalcante");
		funcoesString.iniciarStringManeiraDois("Marcos Leão");
		funcoesString.retornarTamanhoString("Fortaleza no G4");
		funcoesString.retornarCaracterNaPosicao("Ceará", 0);
		funcoesString.retornarStringApartirDoIndice("SENAC CEARÁ", 5);
		funcoesString.retornarStringApartirDoIndice("SENAC CEARÁ", 0, 5);
		funcoesString.retornarPrimeiroIndice("Eduardo", "d");
		funcoesString.retornarUltimoIndice("Eduardo", "d");
		funcoesString.isContem("Leonardo", "Leo");
		funcoesString.isIgual("Maria", "maria");
		

	}

}
