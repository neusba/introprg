/* Programa que a partir de l'especificació d'una forma la dibuixa a través d'un string
 * Les especificacions es rebran com arguments de la línea de comandes
 * 
 */

public class Formes {
	public static void main(String[] args){
 		for (int i=0; i<args.length; i++) {
 	        	System.out.println(args[i]);
			boolean dimensioCorrecte = especificacioDimensio(args[i]);
			if (!dimensioCorrecte) {
				System.out.println("Especificació no vàlida");
				continue;
			}
 	            	int files = obteFiles(args[i]);
 	            	int columnes = obteColumnes(args[i]);
 	           	if (files < 1 || columnes < 1) {
 	                	System.out.println("Especificació no vàlida");
				continue;
	            	} 
			boolean formaCorrecte = especificacioForma(args[i]);
			if (!formaCorrecte) {
				UtilTaula.inicialitzaEnFals(files, columnes);
				continue;
			}
			boolean[][] taula = new boolean[files][columnes];
			String forma = retornaForma(args[i]);
			switch (forma) {
				case "\\": UtilTaula.inicialitzaPrimeraDiagonal(taula); break;
				case "|": UtilTaula.inicialitzaVerticalMig(taula); break;
				case "-": UtilTaula.inicialitzaHoritzontalMig(taula); break;
				case "+": UtilTaula.inicialitzaQuarts(taula); break;
				case "/": UtilTaula.inicialitzaSegonaDiagonal(taula); break;
				case "x": UtilTaula.inicialitzaCreu(taula); break;
				case "||": UtilTaula.inicialitzaZebra(taula); break;
				case "++": UtilTaula.inicialitzaEscacs(taula); break;
				default: UtilTaula.inicialitzaEnFals(files, columnes);
			}
               		String resultat = UtilTaula.taulaToString(taula, 'X', '·');
                	System.out.println(resultat);
            		 
        	}
    	}

	// Funció que comprova si l'argument donat és correcte
	public static boolean especificacioDimensio(String especificacio) {
		String dimensio = "";
		for (int i=0; i<especificacio.length(); i++) {
			if (Character.isDigit(especificacio.charAt(i))) {
				dimensio = dimensio + especificacio.charAt(i);
			} else if (especificacio.charAt(i) == 'x') {
				dimensio = dimensio + especificacio.charAt(i);
			}
		}	
		String[] coordenades = dimensio.split("x");
        	if (coordenades.length != 2) return false;
        	for (int i=0; i<coordenades.length; i++) {
            		if (! UtilString.esEnter(coordenades[i])) return false;
            		int valor = Integer.parseInt(coordenades[i]);
            		if (valor <= 0 || valor > 99) return false;
        	}
        	return true;
    	}

	// funció que extreu la fila corresponent a la dimensió donada
	public static int obteFiles(String especificacio) {
		boolean dimensioCorrecte = especificacioDimensio(especificacio);
		if (!dimensioCorrecte) {
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
		boolean dimensioCorrecte = especificacioDimensio(especificacio);
		if (!dimensioCorrecte) {
			return - 1;
		}
		char[] valors = especificacio.toCharArray();
		String columna = "";
		for (int i=valors.length - 1; i>=0; i--) {
			if (Character.isDigit(valors[i])) {
				columna = valors[i] + columna;
			} else if (valors[i] == 'x') {
				break;
			}
		}
		int columnes = Integer.parseInt(columna);
		return columnes;
	}

	// funció que comprova si la especificació de la forma és correcte
	public static boolean especificacioForma(String especificacio) {
		String formaAValidar = "";
		String formes = "\\,|,-,+,/,x,=,||,++";
		String[] formesArray = formes.split(",");
		for (int i=especificacio.length() - 1; i>=especificacio.length() - 2; i--) {
			formaAValidar = formaAValidar + especificacio.charAt(i);
		}
		String forma = "";
		for (int i=0; i<formaAValidar.length(); i++) {
			if (!Character.isDigit(formaAValidar.charAt(i))) {
				forma = forma + formaAValidar.charAt(i);
			}
		}
		for (int i=0; i<formesArray.length; i++) {
			if (forma.equals(formesArray[i])) {
				return true;
			}
		}
		return false;
	}	

	// funció que retorna la forma especificada en forma de string
	public static String retornaForma(String especificacio) {
		String formaAValidar = "";
		String formes = "\\,|,-,+,/,x,=,||,++";
		String[] formesArray = formes.split(",");
		for (int i=especificacio.length() - 1; i>=especificacio.length() - 2; i--) {
			formaAValidar = formaAValidar + especificacio.charAt(i);
		}
		String forma = "";
		for (int i=0; i<formaAValidar.length(); i++) {
			if (!Character.isDigit(formaAValidar.charAt(i))) {
				forma = forma + formaAValidar.charAt(i);
			}
		}
		return forma;
	}	
}

