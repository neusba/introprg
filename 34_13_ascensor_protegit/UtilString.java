/* Utilitat per l'exercici "Es enter" per confirmar si un número és enter o no
 *
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
}

		

