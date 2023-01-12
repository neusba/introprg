/* Programa que transforma certs caràcters d'una taula en altres caràcters escollits per l'usuari */

public class DigitArt {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Especifiqueu un o més arguments en la línia de comandes");
			return;
		}
		for (int i=0; i<args.length; i++) {
			String arg = "";
			arg = arg + args[i];
			processaArgument(arg); // cridem al següent mòdul
		}
	}

	// Procediment que crida al següent mòdul per cada caràcter que troba a l'argument */
	public static void processaArgument(String arg) {
		char[] caracters = arg.toCharArray();
		for (int i=0; i<caracters.length; i++) {
			processaCaracter(caracters[i]);
		}
	}

	// procediment que valorà el caràcter rebut i actua en funció si es un caràcter vàlid per continuar amb el procés */
	public static void processaCaracter(char ch) {
		char[][] origen;
        	switch (ch) {
             		case '1': origen = construeix1();
				break;
             		case '2': origen = construeix2();
                       		break;
             		case '3': origen = construeix3();
                       		break;
             		default: return;    // no conec aquest caràcter
         	}
         	char[][] desti = UtilTaula.substitueix(origen, 'X', ch);
         	mostraResultat(origen, desti);
         	System.out.println();
       	}

	// construcció taula número 1
	public static char[][] construeix1() {
		return new char[][] {
             		{'·', '·', '·', '·', '·'},
                 	{'·', 'X', 'X', '·', '·'},
                 	{'·', '·', 'X', '·', '·'},
                 	{'·', '·', 'X', '·', '·'},
                 	{'·', '·', 'X', '·', '·'},
                 	{'·', 'X', 'X', 'X', '·'},
                 	{'·', '·', '·', '·', '·'}
         	};
     	}

	// construcció taula número 2
 	public static char[][] construeix2() {
		return new char[][] {
                	{'·', '·', '·', '·', '·', '·'},
                 	{'·', 'X', 'X', 'X', 'X', '·'},
                 	{'·', '·', '·', '·', 'X', '·'},
                 	{'·', 'X', 'X', 'X', 'X', '·'},
                 	{'·', 'X', '·', '·', '·', '·'},
                 	{'·', 'X', 'X', 'X', 'X', '·'},
                 	{'·', '·', '·', '·', '·', '·'},
         	};
     	}

	// construccií taula número 3
 	public static char[][] construeix3() {
		return new char[][] {
                	{'·', '·', '·', '·', '·', '·'},
                 	{'·', 'X', 'X', 'X', 'X', '·'},
                 	{'·', '·', '·', '·', 'X', '·'},
                 	{'·', 'X', 'X', 'X', 'X', '·'},
                 	{'·', '·', '·', '·', 'X', '·'},
                 	{'·', 'X', 'X', 'X', 'X', '·'},
                 	{'·', '·', '·', '·', '·', '·'},
         	};
     	}
	
	// procediment que mostra el resultat de les taules origen i destí */
	public static void mostraResultat(char[][] origen, char[][] desti) {
		for (int i=0; i<origen.length; i++) {
			for (int j=0; j<origen[0].length; j++) {
				System.out.print(origen[i][j]);
			}
			System.out.print(" -> ");
			for (int j=0; j<desti[0].length; j++) {
				System.out.print(desti[i][j]);
			}
			System.out.println();
		}
	}
}

