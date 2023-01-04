/* Funcions per l'exercici que contrueix una partida de tres en ratlla
 */
public class UtilString {
	// funcio que crea el taulell de la partida
	public static char[][] creacioTaulell() {
		char[][] taulell = new char[3][3]; // files x columnes
		for (int fila=0; fila<3; fila++) {
			for (int col=0; col<3; col++) {
				taulell[fila][col] = '·';
			}
		}
		return taulell;
	}

	// funcio que converteix una part de la coordenada a fila
	public static int conversioFila(String coordenada) {
		int fila = 0;
		for (int i=0; i<coordenada.length(); i++) {
			String aux = "";
			if (i == 0) {
				aux = aux + coordenada.charAt(i);
				fila = Integer.parseInt(aux);
			}
		}
		return fila;
	}
	// funcio que converteix una part de la coordenada a columna
	public static int conversioColumna(String coordenada) {
		int columna = 0;
		for (int i=0; i<coordenada.length(); i++) {
			String aux = "";
			if (i == 1) {
				aux = aux + coordenada.charAt(i);
				columna = Integer.parseInt(aux);
			}
		}
		return columna;
	}

	// format que comprova si el jugador abandona la partida
	public static boolean jugadorAbandona(String coordenada) {
		if (coordenada.equals("a")) {
			return true;
		}
		return false;
	}
	
	// funcio que comprova el format de la coordenada
	public static boolean formatCorrecte(String coordenada) {
		if (coordenada.length() != 2) {
			System.out.println("Error");
			return false;
		}
		for (int i=0; i<coordenada.length(); i++) {
			String ch = "";
			ch = ch + coordenada.charAt(i);
			int digit = Integer.parseInt(ch);
			if (digit < 0 || digit > 2) {
				System.out.println("Error");
				return false;
			}
		}
		return true;
	}		
	
}
