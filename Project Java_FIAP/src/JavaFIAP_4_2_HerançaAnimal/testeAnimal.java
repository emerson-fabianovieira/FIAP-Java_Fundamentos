package JavaFIAP_4_1_Heran�aAnimal;

public class testeAnimal {
	
	public static void main (String[] args) {
		
		Animal animal = new Animal () ;
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Cachorro come ra��o de cachorro");
		cachorro.setLocomove("Cachorro usa 4 patas");
		cachorro.setLatido("Cachorro faz Au Au");
		
		Animal poodle = new Cachorro () ;
		poodle.setAlimenta("Poodle come ra��o de cachorro");
		poodle.setLocomove("Poodle usa 4 patas");
			
	}
	

}
