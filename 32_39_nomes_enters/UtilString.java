/* Funcions per l'exercici 32_39
 * La primera funció comptarà la quantitat de nombres enters hi ha en l'array de strings main
 * La segona función crearà el nou array amb només els nombres enters
 * La tercer s'ecarregarà de sumar els valor de l'array i mostrarà el resultat
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

