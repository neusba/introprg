/* Mòdul per l'exercici "Mostra interval modular", el qual s'encarregarà de
 * trobar els caràcters dins del interval i retornar la secció corresponent a 
 * les dades donades
 */

public class UtilString {
	public static String intervalString(String text, int inici, int fi) {
		// Canviem les variables segons les possibilitats
		if (inici < 0) {
			inici = 0;
		} else if (inici > text.length() - 1) {
			inici = text.length() - 1;
		}
		if (fi < 0) {
			fi = 0;
		} else if (fi > text.length() - 1) {
			fi = text.length() - 1;
		}
		// Creem els bucles que recorren la longitud indicada
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
}
			
