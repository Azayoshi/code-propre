package fr.diginamic.utils;

public final class StringUtils {

	/**
	 * Retourne la distance de Levenshtein entre 2 chaines de caractères
	 * 
	 * @param premier_chaine chaine 1
	 * @param deuxieme_chaine chaine 2
	 * @return distance
	 */
	public static Integer levenshteinDistance(CharSequence premier_chaine, CharSequence deuxieme_chaine) {

		int taillePchaine = premier_chaine.length() + 1;
		int tailleDchaine = deuxieme_chaine.length() + 1;


		int[] cost = new int[taillePchaine];
		int[] newcost = new int[taillePchaine];

		for (int i = 0; i < taillePchaine; i++) {
			cost[i] = i;
		}

		for (int j = 1; j < tailleDchaine; j++) {
			newcost[0] = j;

			for (int i = 1; i < taillePchaine; i++) {
				int match = (premier_chaine.charAt(i - 1) == deuxieme_chaine.charAt(j - 1)) ? 0 : 1;

				int costReplace = cost[i - 1] + match;
				int costInsert = cost[i] + 1;
				int costDelete = newcost[i - 1] + 1;

				newcost[i] = Math.min(Math.min(costInsert, costDelete), costReplace);
			}

			int[] swap = cost;
			cost = newcost;
			newcost = swap;
		}
		return cost[taillePchaine - 1];
	}
}
