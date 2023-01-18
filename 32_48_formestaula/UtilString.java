/* Funcio que comprova si els string donats son nombres enters o no
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
}
