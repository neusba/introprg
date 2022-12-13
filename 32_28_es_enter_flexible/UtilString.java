/* Funcions per l'exercici 32_28
 * Afegirem dues funcions noves en cas de que sigui estricte o no
 */
public class UtilString {
	public static boolean esEnter(String text) {
		if (text.isEmpty()) {
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
			esEnter(text.strip());
		}
		return true;
	}
}

	
