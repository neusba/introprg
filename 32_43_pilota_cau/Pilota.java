/* Programa que simula el moviment d'una pilota a través de la pantalla de la terminal mitjançant la tecla enter */

public class Pilota {
	public static final int N_FILES = 9;
     	public static final int N_COLS = 13;

	public static void main(String[] args)  {
        	char[][] camp = new char[N_FILES][N_COLS];
         	netejaCamp(camp);
         	int fila = 0;
         	int col = 0;
         	do {
             	posicionaPilota(camp, fila, col);
             	netejaPantalla();
             	mostraCamp(camp);
             	netejaPosicio(camp, fila, col);
             	fila = seguentFila(fila);
             	col = seguentCol(col);
             	System.out.printf("%nEnter per continuar");
         	} while (Entrada.readLine().isEmpty());
     	}
	// procediment que neteja el camp i el deixa tot amb només puntets
	public static void netejaCamp(char[][] camp) {
		for (int i=0; i<N_FILES; i++) {
			for (int j=0; j<N_COLS; j++) {
				camp[i][j] = '·';
			}
		}
	}

	// procediment que posicio la pilota al lloc del camp corresponent
	public static void posicionaPilota(char[][] camp, int fila, int col) {
		for (int i=0; i<N_FILES; i++) {
			for (int j=0; j<N_COLS; j++) {
				camp[fila][col] = 'O';
			}
		}
	}

	// procediment que neteja la pantalla
	public static void netejaPantalla() {
         	System.out.print("\033[H\033[2J");
         	System.out.flush();
	}

	// procediment que mostra el camp actual
	public static void mostraCamp(char[][] camp) {
        	for (int i=0; i<N_FILES; i++) {
             		for (int j=0; j<N_COLS; j++) {
				System.out.print(camp[i][j]);
			}
             	System.out.println();
         	}
     	}

	// procediment que neteja la posicio actual i la torna un puntet
	public static void netejaPosicio(char[][] camp, int fila, int col) {
		for (int i=0; i<N_FILES; i++) {
			for (int j=0; j<N_COLS; j++) {
				camp[fila][col] = '·';
			}
		}
	}

	// funcio que retorna el nou nombre de fila
	public static int seguentFila(int actual) {
		if (actual == N_FILES) {
			actual = 0;
			return actual;
		} else {
			actual += 1;
			return actual;
		}
	}

	// funcio que retorna el nou nombre de columnes
	public static int seguentCol(int actual) {
		if (actual == N_COLS) {
			actual = 0;
			return actual;
		} else {
			actual += 1;
			return actual;
		}
	}
}







