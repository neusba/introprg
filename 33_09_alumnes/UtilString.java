/* Fitxer de funcions per String de l'exercici Cerca Alumnes 33_09
 * La primera funció és la típica encarregada de valorar si un text és un nombre enter o no;
 */

public class UtilString {
    // Funcio de esEnter()
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

