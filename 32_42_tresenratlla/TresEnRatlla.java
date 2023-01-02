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
			boolean ocupada = UtilString.casellaOcupada(taulell, fila, columna);
			while (ocupada) {
				System.out.println("Ocupada");
				mostraTaulell(taulell);
				System.out.printf("%c?%n", jugador);
				coordenada = Entrada.readLine();
				fila = UtilString.conversioFila(coordenada);
				columna = UtilString.conversioColumna(coordenada);
				ocupada = UtilString.casellaOcupada(taulell, fila, columna);
			}
			// coloquem la posició i mostrem el taulell
			taulell[fila][columna] = jugador;
			mostraTaulell(taulell);
			// comprovem si el jugador ha guanyat la partida
			boolean guanya = UtilString.jugadorGuanya(taulell, jugador);
			if (guanya) {
				System.out.printf("%c guanya", jugador);
				return;
			}

			// comprovem si han empatat
			boolean empat = UtilString.hiHaEmpat(taulell);
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
}
