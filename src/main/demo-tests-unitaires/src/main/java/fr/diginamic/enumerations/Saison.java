package fr.diginamic.enumerations;

public enum Saison {
	PRINTEMPS("Printemps", 1),
	ETE("Eté", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);

	private String libelle;
	private int ordre;

	/**
	 * Constructeur
	 * 
	 * @param libelle libellé
	 * @param ordre   ordre
	 */
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	/**
	 * Permet de rechercher une Saison à partir de son libellé
	 * 
	 * @param libelle libellé
	 * @return {@link Saison}
	 */
	public static Saison valueOfLibelle(String libelle) {
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			if (libelle.toLowerCase().replace("é","e").equals(saison.getLibelle().toLowerCase().replace("é","e"))) {
				return saison;
			}

		}
		return null;
	}
	public String toString() {
		return ordre + ". " + libelle;
	}










	public String getLibelle() {
		return libelle;
	}

	public int getOrdre() {
		return ordre;
	}
}