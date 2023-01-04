/* Programa que implementa el joc del tres en ratlla de forma que es pugui jugar
 * El joc termina amb una d'aquestes tres condicions:
 * El jugador introdueix el valor 'a' en comptes d'un valor vàlid
 * Un dels jugadors aconsegueix fer tres en ratlla
 * Totes les caselles estàn ocuapades
 */
public class TresEnRatlla {
	public static void main(String[] args) {
		// definim jugadors
		char jugadorX = 'X';
		char jugadorO = 'O';
		// creem el taulell inicial
		char[][] taulell = UtilString.creacioTaulell();
		// iniciem el joc i mostrem el taulell inicial
		System.out.println("Comença el joc");
		mostraTaulell(taulell);

		// Comença el primer jugador: j=par serà jugador 'x' i j=impar serà jugador 'o'
		char jugador;
		for (int j=0; j<9; j++) { // j referencia 'jugador'
			// definim el jugador que tira
			if (j%2 == 0) {
				jugador = jugadorX;
			} else {
				jugador = jugadorO;
			}
			System.out.printf("%c?%n", jugador); // demanem la coordenada
			String coordenada = Entrada.readLine();	
			// comprovem si el jugador abandona
			boolean abandona = UtilString.jugadorAbandona(coordenada);
			if (abandona) {
				System.out.printf("%c abandona%n", jugador);
				return;
			}
			// adaptacio coordenada a int 
			int fila = UtilString.conversioFila(coordenada);
			int columna = UtilString.conversioColumna(coordenada);
			// comprova el format de la coordenada
			boolean correcte = UtilString.formatCorrecte(coordenada);
			while (!correcte) {
				System.out.printf("%c?%n", jugador);
				coordenada = Entrada.readLine();
				correcte = UtilString.formatCorrecte(coordenada);
			}
			// comprova si la casella esta ocupada
			boolean ocupada = casellaOcupada(taulell, fila, columna);
			while (ocupada) {
				System.out.println("Ocupada");
				mostraTaulell(taulell);
				System.out.printf("%c?%n", jugador);
				coordenada = Entrada.readLine();
				fila = UtilString.conversioFila(coordenada);
				columna = UtilString.conversioColumna(coordenada);
				ocupada = casellaOcupada(taulell, fila, columna);
			}
			// coloquem la posició i mostrem el taulell
			taulell[fila][columna] = jugador;
			mostraTaulell(taulell);
			// comprovem si el jugador ha guanyat la partida
			boolean guanya = jugadorGuanya(taulell, jugador);
			if (guanya) {
				System.out.printf("%c guanya", jugador);
				return;
			}

			// comprovem si han empatat
			boolean empat = hiHaEmpat(taulell);
			if (empat) {
				System.out.println("Empat");
				return;
			}
		}
	}

	// Procediment que mostra el contingut actual del taulell
	public static void mostraTaulell(char[][] taulell) {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(taulell[i][j]);
			}
			System.out.println();
		}
	}

	// funció que comprova si la casella està ocupada
	public static boolean casellaOcupada(char[][] taulell, int fila, int columna) {
		if (taulell[fila][columna] == '·') {
			return false;
		}
		return true;
	}

	// funcio que comproba si el jugador que està jugant ha guanyat la partida
	public static boolean jugadorGuanya(char[][] taulell, char jugador) {
		boolean ratlla = true;
		// mirem primer totes les columnes de cada fila
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (taulell[i][j] != jugador) {
					ratlla = false;
				}
			}
			if (ratlla) {
				return true;
			}
			ratlla = true;
		}
		// ara comprovem les primeres columnes de la primera fila
		int col = 0;
		int topeCol = col + 1;
		int numeroCol = 0;
		boolean columna = UtilString.faColumna(taulell, col, topeCol, jugador);
		while (numeroCol < 3) {
			if (columna) {
				return true;
			}		
			col += 1;
			topeCol += 1;
			numeroCol += 1;
			columna = UtilString.faColumna(taulell, col, topeCol, jugador);
		}
		// mirem si ha guanyat fent diagonals
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (taulell[0][0] == jugador && taulell[1][1] == jugador && taulell[2][2] == jugador) {
					return true;
				} else if (taulell[0][2] == jugador && taulell[1][1] == jugador && taulell[2][0] == jugador) {
					return true;
				}
			}
		}
		return false;
	}

	// funcio que comprova si han empatat la partida
	public static boolean hiHaEmpat(char[][] taulell) {
		for (int fila=0; fila<3; fila++) {
			for (int col=0; col<3; col++) {
				if (taulell[fila][col] == '·') {
					return false;
				}
			}
		}
		return true;
	}
}
