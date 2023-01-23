/* Funcions de la taula per l'exercici 32_48
 * La primera funció s'encarrega d'inicialitzar una taula en fals
 */

public class UtilTaula {
	// inicialitza taula en fals quan la forma especificada no és correcte
	public static void inicialitzaEnFals(int files, int columnes) {
		for (int i=0; i<files; i++) {
			for (int j=0; j<columnes; j++) {
				System.out.print("·");
			}
			System.out.println();
		}
	}

    	// funcion que transforma una tabla de booleans en un string con diferentes caracteres para TRUE y FALSE
    	public static String taulaToString(boolean[][] taula, char caracterTrue, char caracterFalse) {
		String resultat = "";
		for (int i=0; i<taula.length; i++) {
			for (int j=0; j<taula[0].length; j++) {
				if (taula[i][j] == true) {
					resultat = resultat + caracterTrue;
				} else {
					resultat = resultat + caracterFalse;
				}
				resultat += "\n";
			}
		}
		return resultat;
	}

    	// procedimiento que inicializa una tabla con la primera diagonal en TRUE y el resto FALSE
    	public static void inicialitzaPrimeraDiagonal(boolean[][] taula) {
        	for (int i=0; i<taula.length; i++) {
            		for (int j=0; j<taula[0].length; j++) {
                		taula[i][j] = i==j;
            		}
        	}
    	}

	// procedimiento que inicializa una tabla con la segunda diagonal en TRUE y el resto FALSE
	public static void inicialitzaSegonaDiagonal(boolean[][] taula) {
		for (int i=0; i<taula.length; i++) {
		    	for (int j=0; j<taula[0].length; j++) {
				taula[i][j] = i+j==taula[0].length-1;
		    	}
		}
	}

	// procedimiento que inicializa una tabla con una linea media vertical en TRUE y el resto FALSE
	public static void inicialitzaVerticalMig(boolean[][] taula) {
		int media = taula[0].length%2==1 ? (taula[0].length+1)/2 : taula[0].length/2;
		for (int i=0; i<taula.length; i++) {
			for (int j=0; j<taula[0].length; j++) {
				taula[i][j] = j==media-1;
			}
		}

	}

	// procedimiento que inicializa una tabla con una linea media horizontal en TRUE y el resto FALSE
	public static void inicialitzaHoritzontalMig(boolean[][] taula) {
		int media = taula.length%2==1 ? (taula.length+1)/2 : taula.length/2;
		for (int i=0; i<taula.length; i++) {
			for (int j=0; j<taula[0].length; j++) {
				taula[i][j] = i==media-1;
			}
		}
	}

	// procedimiento que inicializa una tabla con una cruz centrada
	public static void inicialitzaQuarts(boolean[][] taula) {
		int mediaVert = taula[0].length%2==1 ? (taula[0].length+1)/2 : taula[0].length/2;
		int mediaHor = taula.length%2==1 ? (taula.length+1)/2 : taula.length/2;
		for (int i=0; i<taula.length; i++) {
			for (int j=0; j<taula[0].length; j++) {
				taula[i][j] = i==mediaHor-1 || j==mediaVert-1;
		    	}
		}
	}

	// procedimiento que incializa una tabla con una cruz diagonal 
	public static void inicialitzaCreu(boolean[][] taula) {
		for (int i=0; i<taula.length; i++) {
			for (int j=0; j<taula[0].length; j++) {
				if (i+j==taula[0].length-1 || i==j) {
					taula[i][j] = true;
				} else {
					taula[i][j] = false;
				}
			}
		}
	}
		    	

	// procedimiento que inicializa una tabla con lineas horizontales intercaladas en TRUE y FALSE
	public static void inicialitzaPasVianants(boolean[][] taula) {
		for (int i=0; i<taula.length; i++) {
		    	for (int j=0; j<taula[0].length; j++) {
				taula[i][j] = i%2==1;
		    	}
		}        
	}

	// procedimiento que inicializa una tabla con lineas verticales intercaladas en TRUE y FALSE
	public static void inicialitzaZebra(boolean[][] taula) {
		for (int i=0; i<taula.length; i++) {
		    	for (int j=0; j<taula[0].length; j++) {
				taula[i][j] = j%2==1;
		    	}
		} 
	}

	// procedimiento que inicializa una tabla con TRUE y FALSE intercalados como si fuera un tablero de ajedrez
	public static void inicialitzaEscacs(boolean[][] taula) {
		int check = 0;
		for (int i=0; i<taula.length; i++) {
		    	for (int j=0; j<taula[0].length; j++) {
				taula[i][j] = !(check%2==0);
				check += 1;
		    	}
		    	check = i%2==0 ? 1 : 0;
		}
	}
}
