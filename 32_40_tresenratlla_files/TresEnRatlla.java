/* Programa que recrea una partida del joc tres en ratlla
 * Els tres possibles caràcters seran: X, O i ·(en cas que la casella estigui buida)
 */
public class TresEnRatlla {
	public static void main(String[] args) {
		// Creem un array per cada fila
		char[] fila0 = new char[3];
		char[] fila1 = new char[3];
		char[] fila2 = new char[3];
		// inicialització de cada fila
		// fila 0
		fila0[0] = 'O';
		fila0[1] = '·';
		fila0[2] = 'X';
		// fila 1
		fila1[0] = 'X';
	      	fila1[1] = 'X';
		fila1[2] = 'O';
		// fila 2
		fila2[0] = 'O';
	      	fila2[1] = '·';
		fila2[2] = '·';
		// mostrem el taulell
		mostraFila(fila0);
		mostraFila(fila1);
		mostraFila(fila2);
	}
	// funció que mostra el taulell sencer per pantalla
	public static void mostraFila(char[] fila) {
		for (int i=0; i<fila.length; i++) {
			System.out.print(fila[i]);
		}
		System.out.println();
	}
}
