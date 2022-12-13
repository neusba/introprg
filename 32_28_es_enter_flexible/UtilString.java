/* Utilitats per l'exercici 28
 * Utilitat de transformació de resposta String a boolean
 * Utilitat de saber si un número és enter
 */
public class UtilString {
	public static boolean respostaABoolean(String resposta) {
		if (null == resposta) {
			return false;
		}
		resposta = resposta.toLowerCase();
		if (resposta.equals("s") || resposta.equals("y")) {
            		return true;
        	}
        	if (resposta.equals("sí") || resposta.equals("yes")) {
            		return true;
        	}
        	if (resposta.equals("si") || resposta.equals("vale") || resposta.equals("yeah")) {
		       	return true;
        	}
        	return false;
	}
	// Funció per saber si és enter o no (estricte/no estricte)
	public static boolean esEnter(String text, boolean estricte) {
		if (text.isEmpty()) {
			return false;
		} else {
			if (text.endsWith("-") || text.endsWith("+")) {
				return false;
			}
			for (int i=0; i < text.length(); i++) {
				if (Character.isLetter(text.charAt(i))) {
					return false;
				}
				if (estricte) {
					if (Character.isWhitespace(text.charAt(i))) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
		return true;
	}
	// Transformació d'un String a enter(estricte/no estricte)
	public static int aEnter(String text, boolean estricte) {
		int aEnter;
		aEnter = Integer.parseInt(text);
		return aEnter;
	}
}

		

