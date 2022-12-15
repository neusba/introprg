/* Funcions per l'exercici 32_31
 * La primera funció
 * La segona 
 */
public class UtilString {
	public static String toString(int nota, String llistaNotes) {
		String notaString = Integer.toString(nota);
		llistaNotes = llistaNotes + notaString;
		return llistaNotes;
	}
	// Funció que crea el String final amb comes i el retorna
	public static String mostraNotes(String llistaNotes) {
		String mostraNotes = "";
		for (int i=0; i < llistaNotes.length(); i++) {
			if (i == llistaNotes.length() - 2) {
				mostraNotes = mostraNotes + llistaNotes.charAt(i) + " i ";
			} else if (i == llistaNotes.length() - 1) {
				mostraNotes = mostraNotes + llistaNotes.charAt(i);
			} else {
				mostraNotes = mostraNotes + llistaNotes.charAt(i) + ", ";
			}
		}
		return mostraNotes;
	}
}
