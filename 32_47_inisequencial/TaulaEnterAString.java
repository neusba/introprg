/* Programa que recrea una taula amb les dues dimension que es donaran per línia de comandes i la mostra en forma de String amb un nombre en cada posició
 * S'haurà de comvaprovar si els arguments donats són vàlids per continuar amb el programa
 * Aquesta vegada les taules donades començaran per un nombre seqüencial
 */
public class TaulaEnterAString {
	public static void main(String[] args){
		int valorInicial = 0;
 		for (int i=0; i<args.length; i++) {
 	        	System.out.println(args[i]);
			boolean correcte = especificacioCorrecte(args[i]);
			if (!correcte) {
				System.out.println("Especificació no vàlida");
				continue;
			}
 	            	int files = obteFiles(args[i]);
 	            	int columnes = obteColumnes(args[i]);
 	           	if (files < 1 || columnes < 1) {
 	                	System.out.println("Especificació no vàlida");
	            	} else {
	                	int[][] taula  = new int[files][columnes];
              			UtilTaula.inicialitzaTaula(taula, 1);
				valorInicial += 1;
              			UtilTaula.inicialitzaSequencial(taula, valorInicial);
               			String resultat = UtilTaula.taulaToString(taula);
                		System.out.println(resultat);
            		}
        	}
    	}

	// Funció que comprova si l'argument donat és correcte
	public static boolean especificacioCorrecte(String especificacio) {
		String[] coordenades = especificacio.split("x");
        	if (coordenades.length != 2) return false;
        	for (int i=0; i<coordenades.length; i++) {
            		if (! UtilString.esEnter(coordenades[i])) return false;
            		int valor = Integer.parseInt(coordenades[i]);
            		if (valor < 0 || valor > 99) return false;
        	}
        	return true;
    	}

	// funció que que obte les files de la taula a través del primer nombre donat en l'argument de l'usuari
	public static int obteFiles(String especificacio) {
		boolean correcte = especificacioCorrecte(especificacio);
		if (!correcte) {
			return - 1;
		}
		char[] valors = especificacio.toCharArray();
		String fila = "";
		for (int i=0; i<valors.length; i++) {
			if (Character.isDigit(valors[i])) {
				fila = fila + valors[i];
			} else {
				break;
			}
		}
		int files = Integer.parseInt(fila);
		return files;	
	}

	// funció que que obte les columnes de la taula a través del segon nombre donat en l'argument de l'usuari
	public static int obteColumnes(String especificacio) {
		boolean correcte = especificacioCorrecte(especificacio);
		if (!correcte) {
			return - 1;
		}
		char[] valors = especificacio.toCharArray();
		String columna = "";
		for (int i=valors.length - 1; i>=0; i--) {
			if (Character.isDigit(valors[i])) {
				columna = valors[i] + columna;
			} else {
				break;
			}
		}
		int columnes = Integer.parseInt(columna);
		return columnes;
	}
}
