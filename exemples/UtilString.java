/* Llistat de funcions que serviran d'utilitat per diferents programes
 *
 */

public class UtilString {
	// Mòdul per aïllar només les lletres del text
	public static String nomesLletres(String text) {
		String nomesLletres = "";
		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				nomesLletres = nomesLletres + text.charAt(i);
			}
		}
		return nomesLletres;
	}
	// Mòdul per extreure les lletres separades per comes
	public static String lletresSeparades(String nomesLletres) {
		String lletresSeparades = "";
		for (int i=0; i < nomesLletres.length(); i++) {
			if (nomesLletres.length() == 1) {
				lletresSeparades = lletresSeparades + nomesLletres.charAt(i);
			} else {
				if (i == nomesLletres.length() - 1) {
					lletresSeparades = lletresSeparades + nomesLletres.charAt(i);	
				} else {
					lletresSeparades = lletresSeparades + nomesLletres.charAt(i) + ", ";
				}
			}		
		}
		return lletresSeparades;
	}

	/* Aquest mòdul rebrà un caràcter i comprovarà si és una lletra vocal o no.
	 * Retornarà una resposta en valor boolea, true si és vocal, false si no ho és.
	 */
	public static boolean esVocal(char lletra) {
		String vocals = "aeiouàèéíïòóúüAEIOUÀÈÉÍÏÒÓÚÜ";
		for (int i=0; i < vocals.length(); i++) {
			if (lletra == vocals.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	// Bucles que recorren la longitud d'un text indicada per dos valor enters que dona l'usuari, si es troben fora de rang no es queixarà.
	public static String intervalString(String text, int inici, int fi) {
		String interval = "";
		if (inici < fi) {
			for (int i=inici; i <= fi; i++) {
				interval = interval + text.charAt(i);
			}
		} else {
			for (int i=inici; i >= fi; i--) {
				interval = interval + text.charAt(i);
			}
		}
		return interval;
	}

	// Funció per calcular si un string és un nombre enter o no
	public static boolean esEnter(String text) {
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
			}
		}
		return true;
	}
}

		
