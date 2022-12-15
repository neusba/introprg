/* Funcions per l'exercici 32_32
 * La primera converteix un int a un String
 * La segona filtra les notes i exclou la més alta de la llista
 * La tercera funció ordena amb comes la llista que es motrarà per pantalla
 */
public class UtilString {
	// Funció que converteix un int a enter
	public static String toString(int nota, String llistaNotes) {
		String notaString = Integer.toString(nota);
		llistaNotes = llistaNotes + notaString + ",";
		return llistaNotes;
	}
	// Funció que filtra les notes per excluir la més alta de la llista anterior
	public static String filtraNotes(String llistaNotes, int notaMesAlta) {
		String llistaFinal = "";
		String notaAlta = Integer.toString(notaMesAlta);
		String temp = "";
		for (int i=0; i < llistaNotes.length(); i++) {
			if (!Character.isDigit(llistaNotes.charAt(i))) {
				if (!temp.equals(notaAlta)) {
					llistaFinal = llistaFinal + llistaNotes.charAt(i);
				}
			}
			temp = temp + llistaNotes.charAt(i);
		}
		return llistaFinal;
	}
	// Funció que ordena la llista final amb les notes que no són la més alta
	public static String ordenaNotes(String llistaFinal) {
		String llistaFinalOrdenada = "";
		for (int i=0; i < llistaFinal.length(); i++) {
			if (i == llistaFinal.length() - 2) {
				llistaFinalOrdenada = llistaFinalOrdenada + llistaFinal.charAt(i) + " i ";
			} else if (i == llistaFinal.length() - 1) {
				llistaFinalOrdenada = llistaFinalOrdenada + llistaFinal.charAt(i);
			} else {
				llistaFinalOrdenada = llistaFinalOrdenada + llistaFinal.charAt(i) + ", ";
			}
		}
		return llistaFinalOrdenada;
	}
}

