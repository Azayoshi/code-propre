package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire{


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
	

}
