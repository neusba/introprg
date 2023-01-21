/* Funcions per taules de l'exercici 32_46
 * La primera funció s'encarrega de tornar la taul inicialitzada amb els valors donats
 * La segona la retorna en forma de String per mostrar-la per pantalla
 */

public class UtilTaula {
	// funcio que retorna la taula inicialitzada
	public static void inicialitzaTaula(int[][] taula, int valor) {
		for (int i=0; i<taula.length; i++) {
			for (int j=0; j<taula[i].length; j++) {
				taula[i][j] = valor;
			}
		}
	}

	// Funcio que retorna la taula inicial en forma de String transformada
	public static String taulaToString(int[][] taula) {
		String resultat = "";
		for (int i=0; i<taula.length; i++) {
			for (int j=0; j<taula[i].length; j++) {
				resultat = resultat + String.format("%8d", taula[i][j]);
			}
			resultat = resultat + String.format("%n");
		}
		return resultat;
	}
}
