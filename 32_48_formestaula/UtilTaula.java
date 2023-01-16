/* Funcions per l'exercici 32_48 */

public class UtilTaula {
	public static void inicialitzaEnFals(int files, int columnes) {
		for (int i=0; i<files; i++) {
			for (int j=0; j<columnes; j++) {
				System.out.print("·");
			}
			System.out.println();
		}
	}

	// funcio que recrea el dibuix de la primera diagonal
	public static boolean primeraDiagonal(boolean[][] taula) {

