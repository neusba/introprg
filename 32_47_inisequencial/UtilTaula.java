/* Funcions per taules de l'exercici 32_46 */

public class UtilTaula {
	// funcio que retorna la taula inicialitzada
	public static void inicialitzaTaula(int[][] taula, int valor) {
		for (int i=0; i<taula.length; i++) {
			for (int j=0; j<taula[i].length; j++) {
				taula[i][j] = valor;
			}
		}
	}

	// funcio que retorna la taula sequenciada
	public static void inicialitzaSequencial(int[][] taula, int valorInicial) {
		int sequenciador = 0;
		for (int i=0; i<taula.length; i++) {
			for (int j=0; j<taula[i].length; j++) {
				sequenciador += 1;
				if (i == 0 && j == 0) {
					taula[i][j] = valorInicial;
				} else {
					taula[i][j] = valorInicial + sequenciador;
				}
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
