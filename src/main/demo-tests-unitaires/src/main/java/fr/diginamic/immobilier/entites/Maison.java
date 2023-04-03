package fr.diginamic.immobilier.entites;
/** Représente une maison avec toutes ses pièces
 * @author DIGINAMIC
 *
 */
public class Maison {

	private Piece[] pieceMaison;

	public Maison(){

		pieceMaison = new Piece[0];
	}

	public void ajouterPiece(Piece nouvellePiece) {

		if (nouvellePiece != null) {

			Piece[] newTab = new Piece[pieceMaison.length+1];

			for (int i = 0; i< pieceMaison.length; i++){
				newTab[i]= pieceMaison[i];
			}

			newTab[newTab.length - 1] = nouvellePiece;

			this.pieceMaison = newTab;
		}
	}
	
	public int nbPieces() {
		return pieceMaison.length;
	}


	public double superficieEtage(int Etage) {

		for (int i = 0; i < pieceMaison.length; i++) {
			if (Etage == this.pieceMaison[i].getNumEtage()) {
				superficieEtage += this.pieceMaison[i].getSuperficie();
			}
		}

		return superficieEtage;
	}
	
	/** Retourne la superficie total pour un type de pièce donné
	 * @param typePiece type de pièce
	 * @return double
	 */
	public double superficieTypePiece(String typePiece) {
		double superficie = 0;

		for (int i = 0; i < pieceMaison.length; i++) {
			if (typePiece!=null && typePiece.equalsIgnoreCase(this.pieceMaison[i].getType())) {
				superficie = superficie + this.pieceMaison[i].getSuperficie();
			}
		}

		return superficie;
	}

	/** Retourne la surface totale
	 * @return double
	 */
	public double calculerSurface() {
		double superficieTot = 0;

		for (int i = 0; i < pieceMaison.length; i++) {
			superficieTot = superficieTot + this.pieceMaison[i].getSuperficie();
		}

		return superficieTot;
	}

	/** Getter pour l'attribut pieces
	 * @return the pieces
	 */
	public Piece[] getPieceMaison() {
		return pieceMaison;
	}

}