package HerancaPolimorfismoCollections;

public class Cavalo extends Animal {
	
	public Cavalo () {
		super("Garanhão", 18);
	}
	
	public void emitirSom() {
		System.out.println("iiiiiiiirihirhirhi");
	}
	
	public void acao() {
		System.out.println("*Galopando*");
	}
}