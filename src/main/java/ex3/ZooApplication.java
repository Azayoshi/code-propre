package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", TypeAnimal.MAMIFERE, Comportementt.HERBIVORE);
		zoo.addAnimal("Zèbre", TypeAnimal.MAMIFERE, Comportementt.HERBIVORE);
		zoo.addAnimal("Lion", TypeAnimal.MAMIFERE, Comportementt.HERBIVORE);
		zoo.addAnimal("Panthère", TypeAnimal.MAMIFERE, Comportementt.CARNIVORE);
		zoo.addAnimal("Requin blanc", TypeAnimal.POISSON, Comportementt.HERBIVORE);
		zoo.addAnimal("Truite dorée", TypeAnimal.POISSON, Comportementt.HERBIVORE);
		zoo.addAnimal("Boa constrictor", TypeAnimal.SERPENT, Comportementt.CARNIVORE);
		zoo.addAnimal("Python", TypeAnimal.SERPENT, Comportementt.CARNIVORE);
	}

}
