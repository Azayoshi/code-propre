package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire{

	private double solde;
	private double decouvert;



	/** création variable type pour CC=compte courant ou LA=livretA */
	private String type;


	/**
	 * @param solde
	 * @param decouvert
	 */
	public CompteBancaire(double solde, double decouvert) {

		this("CC",solde,decouvert);
	}

	/**
	 *
	 * @param type
	 * @param solde
	 * @param decouvert
	 */
	protected CompteBancaire(String type,double solde, double decouvert) {

		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}


	/** Ajoute un montant au solde de départ
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}

	/** Ajoute un montant au solde de départ
	 * @param montant
	 */
	public void debiterMontant(double montant){

		if (this.solde - montant >= decouvert){
			this.solde = solde - montant;
		}

	}



	/** Getter
	 * @return solde
	 */
	public double getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter
	 * @return decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/** Getter
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/** Setter
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

}
