/* Funcions per l'exercici 32_54
 * La primera funció retornarà un string amb només les lletres del text donat
 */

public class UtilString {
	// nomes lletres recursiu
	public static String nomesLletres(String text) {
		String textLletres = "";
		if (text.isEmpty()) return "";				// cas base
		
		char primer = text.charAt(0);
		String esLletra = "";
		if (Character.isLetter(primer)) {			// tracta pas actual
			esLletra = esLletra + primer;
		}

		text = text.substring(1);
		String restaText = nomesLletres(text);			// pas recursiu
		
		textLletres = esLletra + restaText;
		return textLletres;
	}
}	
