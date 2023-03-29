package ex3;

import java.util.List;

public class Zoo {
	private String nom;
	private List<Animal> annimaux;


	public Zoo(String nom){
		this.nom = nom;
	}

	public void addAnimal(String nomAnimal, TypeAnimal typeAnimal, Comportementt comportement){
		annimaux.add(new Animal(typeAnimal,nomAnimal,comportement));
	}

	public void afficherListeAnimaux(){
		for (int i=0; i<annimaux.size(); i++) {
			System.out.println(annimaux);
		}
	}

	public int taille() {
		return annimaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
