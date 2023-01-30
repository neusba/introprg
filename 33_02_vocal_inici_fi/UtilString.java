/* Funcions per l'exercici 33_02 
 * Aquest mòdul rebrà un caràcter i comprovarà si és una lletra vocal o no.
 * Retornarà una resposta en valor boolea, true si és vocal, false si no ho és.
 */

public class UtilString {
	public static boolean esVocal(char lletra, char ultima) {
		String vocals = "aeiouàèéíïòóúüAEIOUÀÈÉÍÏÒÓÚÜ";
		for (int i=0; i < vocals.length(); i++) {
			if (lletra == vocals.charAt(i) || ultima == vocals.charAt(i)) {
				return true;
			}
		}
		return false;
	}
} 
