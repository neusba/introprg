/* Programa que recrea una partida de tres en ratlla
 * Aquesta vegada ho farem mitjançant un array de arrays de tipus char
 * Com a millora, afegirem les comprovacions necessàries per a que l'últim moviment sigui adequat
 */
public class TresEnRatlla {
	public static void main(String[] args) {
		// creació del taulell
		char[][] taulell = new char[3][3];
		
		//inicialitzem cada fila
		// fila 0
		taulell[0][0] = '·';
		taulell[0][1] = 'O';
		taulell[0][2] = 'O';
		// fila 1
		taulell[1][0] = '·';
		taulell[1][1] = 'X';
		taulell[1][2] = '·';
		// fila 2
		taulell[2][0] = '·';
		taulell[2][1] = '·';
		taulell[2][2] = 'X';

		// mostrar posiciones del taulell
		System.out.println("La posició inicial del taulell:");
		mostraFila(taulell[0]);
		mostraFila(taulell[1]);
		mostraFila(taulell[2]);
	// Preguntem a l'usuari el següent moviment
		System.out.println("Fila del següent moviment?");
		int fila = Integer.parseInt(Entrada.readLine());
		System.out.println("columna del següent moviment?");
		int col = Integer.parseInt(Entrada.readLine());
	// coloquem la nova posició
		taulell[fila][col] = 'X';

	// mostrem de nou el taulell
		System.out.println("Posicio final del taulell:");
		mostraFila(taulell[0]);
		mostraFila(taulell[1]);
		mostraFila(taulell[2]);
	}	

	// Mostrem les 3 files
	public static void mostraFila(char[] fila) {
		for (int i=0; i<fila.length; i++) {
			System.out.print(fila[i]);
		}
		System.out.println();
	}
}


