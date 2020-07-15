package HerancaPolimorfismoCollections;
import java.util.Scanner;

public class MainAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Animal animal = null;
		
		int escolha;
		Scanner leia = new Scanner (System.in);
		
			
		for (int i = 1; i <= 3; i++ ) {
			
			switch(i) {
			
			case 1:
				animal = cachorro;
				animal.emitirSom();
				animal.acao();
				break;
			
			case 2:
				animal = cavalo;
				animal.emitirSom();
				animal.acao();
				break;
				
			case 3:
				animal = preguica;
				animal.emitirSom();
				animal.acao();
				break;
				
			}	
		}			
	}
}
