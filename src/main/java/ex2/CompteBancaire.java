package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	private double solde;
	private double decouvert;
	private double tauxRemuneration;
	private String type;

	
	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Débit d'un montant du solde
	 * Si c'est un CC alors le débit doit être supérieur aux découvert
	 * Sinon on affiche une erreur
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (type.equals("CC")){
			if (this.solde - montant > decouvert){
				this.solde = solde - montant;
			}
			else {
				System.out.println("Découvert dépassé !!");
			}
		}

		/** Si c'est un LA alors le débit doit être supérieur à 0
		 * Sinon on affiche une erreur
		 * */
		else if (type.equals("LA")){
			if (this.solde - montant > 0){
				this.solde = solde - montant;
			}else {
				System.out.println("Débit supérieur au solde du compte !!");
			}
		}
	}


	public void appliquerRemuAnnuelle(){
		if (type.equals("LA")){
			this.solde = solde + solde*tauxRemuneration/100;
		}
	}
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
