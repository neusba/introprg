/* Mòdul que aïlla les lletres del text donat a l'exercici NomesLletres */

public class UtilString {
	public static String nomesLletres(String text) {
	// Mòdul per aïllar només les lletres del text
		String nomesLletres = "";
		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				nomesLletres = nomesLletres + text.charAt(i);
			}
		}
		return nomesLletres;
	}
	// Mòdul per extreure les lletres separades
	public static String lletresSeparades(String nomesLletres) {
		String lletresSeparades = "";
		for (int i=0; i < nomesLletres.length(); i++) {
			if (nomesLletres.length() == 1) {
				System.out.print(nomesLletres.charAt(i));
			} else {
				if (i == nomesLletres.length() - 1) {
					System.out.print(nomesLletres.charAt(i));
				} else {
					System.out.print(nomesLletres.charAt(i) + ", ");
				}
			}		
		}
		return lletresSeparades;
	}
}
