/* Funcions per l'exercici 33_02 
 * Aquest mòdul rebrà un caràcter i comprovarà si és una lletra vocal o no.
 * Retornarà una resposta en valor boolea, true si és vocal, false si no ho és.
 */

public class UtilString {
	public static boolean esVocal(String word) {
		String vocals = "aeiouàèéíïòóúüAEIOUÀÈÉÍÏÒÓÚÜ";
		char primera = word.charAt(0);
		char ultima = word.charAt(word.length() - 1);
		for (int i=0; i < vocals.length(); i++) {
			if (primera == vocals.charAt(i) || ultima == vocals.charAt(i)) {
				return true;
			}
		}
		return false;
	}
} 
