package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String format(String pattern, Date date) {
		/** Création nouveau format "formateur" avec "SimpleDateFormat"*/
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		/** retourner la date de formateur*/
		return formateur.format(date);
	}

	public static String formatparDefaut(Date date) {

		return format("dd/MM/yyyy HH:mm:ss",date);

	}
}
