/* Funcions per l'exercici 32_31
 * La primera funció convertirà els nombre int que rebem per entrada en String per després poder afegir-los a un String buit
 * La segona s'encarrega de crear el String que mostrarem al final del programa
 */
public class UtilString {
	// Funció que converteix un int a enter
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
