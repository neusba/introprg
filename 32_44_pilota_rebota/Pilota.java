/* Programa que simula el recorregut d'una pilota dins d'un camp en la terminal mitjançant la tecla enter
 * Aquesta vegada la pilota rebotarà quan arribi a límit de la columna o la fila
 */

public class Pilota {
 	public static final int N_FILES = 9;
    	public static final int N_COLS = 14;

	public static void main(String[] args)  {
        	char[][] camp = new char[N_FILES][N_COLS];
        	netejaCamp(camp);
	
        	int[] posicio = new int[2];         // fila, col
        	canviaPosicio(posicio, 0, 0);       // posició inicial (0, 0)
	
        	int[] increment = new int[2];       // incFila, incCol
        	canviaIncrement(increment, 1, 1);   // desplaçament inicial: 1 fila 1 columna

        	while (true) {
            	posicionaPilota(camp, posicio);
            	netejaPantalla();
            	mostraCamp(camp);
            	netejaPosicio(camp, posicio);
            	seguentPosicio(posicio, increment);
            	System.out.printf("%nEnter per continuar");
            	Entrada.readLine();
		}
        }

	// procediment encarregat de netejar el camp
	public static void netejaCamp(char[][] camp) {
		for (int i=0; i<N_FILES; i++) {
			for (int j=0; j<N_COLS; j++) {
				camp[i][j] = '·';
			}
		}
	}

	// procediment que canvia la posició actual de la fila i la columna
	public static void canviaPosicio(int[] posicio, int novaFila, int novaCol) {
		posicio[0] = novaFila;
		posicio[1] = novaCol;
	}

	// procediment que modifica l'increment de les files i columnes
	public static void canviaIncrement(int[] increment, int nouIncFila, int nouIncCol) {
		increment[0] = nouIncFila;
		increment[1] = nouIncCol;
	}

	// procediment que posiciona la pilota en el lloc corresponent segons la fila, la columna i l'increment
	public static void posicionaPilota(char[][] camp, int[] posicio) {
		int fila = posicio[0];
		int col = posicio[1];

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

	// procediment que mostra l'estat actual del camp
	public static void mostraCamp(char[][] camp) {
        	for (int i=0; i<N_FILES; i++) {
             		for (int j=0; j<N_COLS; j++) {
				System.out.print(camp[i][j]);
			}
             	System.out.println();
         	}
     	}

	// procediment que neteja la posició actual del camp
	public static void netejaPosicio(char[][] camp, int[] posicio) {
		int fila = posicio[0];
		int col = posicio[1];

		for (int i=0; i<N_FILES; i++) {
			for (int j=0; j<N_COLS; j++) {
				camp[fila][col] = '·';
			}
		}
	}

	// Procediment que dedueix la següent posició de fila i columna
	public static void seguentPosicio(int[] posicio, int[] increment) {
        	int fila = obteFila(posicio);
        	int col = obteCol(posicio);
        	int incFila = obteIncrFila(increment);
        	int incCol = obteIncrCol(increment);

        	// actualitza la fila
        	fila = fila + incFila;
        	if (fila < 0) {                     
            		fila = 1;                           
            		incFila = 1;                        
        	} else if (fila > N_FILES -1) {     
        		fila = N_FILES - 2;
			incFila = - 1;
		}

        	// actualitza la columna
        	col = col + incCol;
		if (col < 0) {
			col = 1;
			incCol = 1;
		} else if (col > N_COLS - 1) {
			col = N_COLS -2;
			incCol = -1;
		}
	
        	// actualitza la posició i l'increment
        	canviaPosicio(posicio, fila, col);
        	canviaIncrement(increment, incFila, incCol);
    	}	

	// Funció que obté la posició actual de la fila
	public static int obteFila(int[] posicio) {
       		return posicio[0];
	}	
	
	// Funció que obté la posició actual de la columna
	public static int obteCol(int[] posicio) {
		return posicio[1];
	}

	// Funcio que obté l'increment actual de la fila
	public static int obteIncrFila(int[] increment) {
		return increment[0];
	}

	// Funció que obté l'increment actual de la columna
	public static int obteIncrCol(int[] increment) {
		return increment[1];
	}
}
