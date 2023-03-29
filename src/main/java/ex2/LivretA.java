package ex2;

public class LivretA extends CompteBancaire{

	private double tauxRemuneration;

	/**
	 * Constructeur pour créer un LivretA
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(double solde,  double tauxRemuneration) {
		super("LA",solde,0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/** Getter
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}


	public void appliquerRemuAnnuelle(){
		this.setSolde( this.getSolde() + this.getSolde()*tauxRemuneration/100);

	}
}
