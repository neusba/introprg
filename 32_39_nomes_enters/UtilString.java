/* Funcions per l'exercici 32_39
 */
public class UtilString {
	// funció que comprova si un nombre és enter o no
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
}

