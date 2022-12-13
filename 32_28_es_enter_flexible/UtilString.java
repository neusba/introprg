/* Funcions per l'exercici 32_28
 * Afegirem dues funcions noves en cas de que sigui estricte o no
 */
public class UtilString {
	public static boolean esEnter(String text) {
		if (text.isEmpty() || text.isBlank()) {
			return false;
		} else {
			if (text.endsWith("-") || text.endsWith("+")) {
				return false;
			}
			for (int i=0; i < text.length(); i++) {
				if (Character.isLetter(text.charAt(i)) || Character.isWhitespace(text.charAt(i))) {
					return false;
				}	
			}
		}
		return true;
	}
	// Funció esEnter en cas de que sigui estricte
	public static boolean esEnter(String text, boolean estricte) {
		if (estricte) {
			esEnter(text);
		} else {
			text = text.strip();
			if (text.isEmpty() || text.isBlank()) {
				return false;
			} else {
				if (text.endsWith("-") || text.endsWith("+")) {
					return false;
				}
				for (int i=0; i < text.length(); i++) {
					if (Character.isLetter(text.charAt(i)) || Character.isWhitespace(text.charAt(i))) {
						return false;
					}	
				}
			}
		}
		return true;
	}
	// Funció esEnter
	public static int aEnter(String text, boolean estricte) {
		int nouInt = 0;
		if (estricte) {
			nouInt = Integer.parseInt(text);
		} else {
			nouInt = Integer.parseInt(text.strip());
		}
		return nouInt;
	}
}

	
