/* Funcions de String per l'exercici 32_46
 * La primera funció s'encarrega de comprovar si él nombre donat és un número enter
 */

public class UtilString {
	// funcio que comprova si es un nombre enter
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
}
