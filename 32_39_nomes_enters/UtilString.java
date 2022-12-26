/* Funcions per l'exercici 32_39
 * La primera funció comptarà la quantitat de nombres enters hi ha en l'array de strings main
 * La segona función crearà el nou array amb només els nombres enters
 * La tercer s'ecarregarà de sumar els valor de l'array i mostrarà el resultat
 */
public class UtilString {
	// funcio que compta enters
	public static int quantsEnters(String[] valors) {
		int quants = 0;
		for (int i=0; i<valors.length; i++) {
			boolean esEnter = esEnter(valors[i]);
			if (esEnter) {
				quants += 1;
			}
		}
		return quants;
	}
	// funcio que crea array només d'enters
	public static int[] filtraEnters(String[] valors, int quants) {
		int[] enters = new int[quants];
		int numeroValor = 0;
		int posicio = 0;
		for (int i=0; i<valors.length; i++) {
			boolean esEnter = esEnter(valors[i]);
			if (esEnter) {
				int valor = Integer.parseInt(valors[i]);
				enters[posicio] = valor;
				posicio += 1;
			}
			numeroValor += 1;
		}
		return enters;
	}
	// funció que comprova si un nombre és enter o no
	public static boolean esEnter(String text) {
		if (text.isEmpty()) {
			return false;
		} else {
			if (text.endsWith("-") || text.endsWith("+")) {
				return false;
			}
			for (int i=0; i < text.length(); i++) {
				if (Character.isLetter(text.charAt(i)) || Character.isWhitespace(text.charAt(i))) {
					return false;
				}	
			}
		}
		return true;
	}
	// funció que suma els enters de l'array de'enters
	public static int sumaEnters(int[] enters) {
		int suma = 0;
		for (int i=0; i<enters.length; i++) {
			suma = suma + enters[i];
		}
		return suma;
	}
}

