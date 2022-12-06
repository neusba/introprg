/* Mòdul per l'exercici "Mostra interval modular", el qual s'encarregarà de
 * trobar els caràcters dins del interval i retornar la secció corresponent a 
 * les dades donades
 */

public class UtilString {
	public static String intervalString(String text, int inici, int fi) {
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
			
