package HerancaPolimorfismoCollections;

public class Cachorro extends Animal {
	
	public Cachorro () {
		super("Sophia", 5);
	}
	
	public void emitirSom() {
		System.out.println("Au au au!");
	}
	
	public void acao() {
		System.out.println("*Correndo!*");
	}

}
