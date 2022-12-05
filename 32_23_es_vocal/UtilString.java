/* Funció esVocal() per l'exercici 32_23
 * Petit mòdul per comprovar si una lletra és vocal o no
 */

public class UtilString {
	/* Aquest mòdul rebrà un caràcter i comprovarà si és una lletra vocal o no.
	 * Retornarà una resposta en valor boolea, true si és vocal, false si no ho és.
	 */
	public static boolean esVocal(char lletra) {
		String vocals = "aeiouàèéíïòóúü";
		for (int i=0; i < vocals.length(); i++) {
			if (lletra == vocals.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}

