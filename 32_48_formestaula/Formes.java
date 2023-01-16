/* Programa que a partir de l'especificació d'una forma la dibuixa a través d'un string
 * Les especificacions es rebran com arguments de la línea de comandes
 * 
 */

public class Formes {
	public static void main(String[] args) {
 		for (int i=0; i<args.length; i++) {
 	        	System.out.println(args[i]);
			boolean dimensioCorrecte = especificacioDimensions(args[i]); // Actua sobre la especificacion de la dimension
			boolean formaCorrecte = especificacioFormes(args[i]); // Actua sobre la especificacion de forma (último caràcter)
			if (!dimensioCorrecte) {
				System.out.println("Especificació errònia");
				continue;
			}
 	            	int files = obteFiles(args[i]);
 	            	int columnes = obteColumnes(args[i]);
 	           	if (files < 1 || columnes < 1) {
 	                	System.out.println("Especificació no vàlida");
				continue;
			}
			if (!formaCorrecte) {
				UtilTaula.inicialitzaEnFals(files, columnes);
				continue;
	            	}
			char caracter = obteForma(args[i]);
	                boolean[][] taula  = new boolean[files][columnes];
			switch(caracter) {
				case '\\': taula = UtilTaula.primeraDiagonal(taula);
					   break;
				case '|': taula = UtilTaula.inicialitzaVerticalMig(taula);
					  break;
				case '-': taula = UtilTaula.inicialitzaHoritzontalMig(taula);
					  break;
				case '+': taula = UtilTaula.inicialitzaQuarts(taula);
					  break;
				case '/': taula = UtilTaula.inicialitzasegonaDiagonal(taula);
					  break;
				case 'x': taula = UtilTaula.inicialitzaCreu(taula);
					  break;
				case '=': taula = UtilTaula.inicialitzaPasVianants(taula);
					  break;
				case "'||'": taula = UtilTaula.inicialitzaZebra(taula);
					  break;
				case "'++'": taula = UtilTaula.inicialitzaEscacs(taula);
					  break;
				default: System.out.println("Error default");
			}
               		String resultat = UtilTaula.taulaToString(taula, 'X', '·');
                	System.out.println(resultat);
        	}
    	}

	// Funció que comprova si l'argument donat és correcte en quant a dimension
	public static boolean especificacioDimension(String especificacio) {
		String[] coordenades = especificacio.split("x");
        	if (coordenades.length != 2) return false; // (?)
        	for (int i=0; i<coordenades.length; i++) {
            		if (! UtilString.esEnter(coordenades[i])) return false;
            		int valor = Integer.parseInt(coordenades[i]);
            		if (valor < 0 || valor > 99) return false;
        	}
        	return true;
    	}

	// Funcio que comprova si la forma especificada és correcte
	public static boolean especificacioFormes(String especificacio) {
		String formes = "'\\',|,-,+,/,x,=,||,++";
		char[] formesSplit = formes.split(",");
		for (int i=0; i<especificacio.length(); i++) {
			for (int j=0; j<formesSplit.length; j++) {
				if (especificacio.charAt(especificacio.length() - 1) == formesSplit[j]) {
					return true;
				}
			}
		}
		return false;
	}


	// funció que que obte les files de la taula a través del primer nombre donat en l'argument de l'usuari
	public static int obteFiles(String especificacio) {
		boolean correcte = especificacioDimensions(especificacio);
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
		boolean correcte = especificacioFormes(especificacio);
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
