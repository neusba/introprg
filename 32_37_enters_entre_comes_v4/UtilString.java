/* Funcions per l'exercici 32_37 */

public class UtilString {
	// funció que demana la quantitat de valors dins de l'array
	public static String demanaQuantitat() {
		System.out.println("Quants?");
		String quants = Entrada.readLine();
		return quants;
	}
	// Funció que comprova si el String introduït és enter
	public static boolean esEnter(String quants) {
		if (quants.isEmpty()) {
			return false;
		} else {
			if (quants.endsWith("-") || quants.endsWith("+")) {
				return false;
			}
			for (int i=0; i < quants.length(); i++) {
				if (Character.isLetter(quants.charAt(i)) || Character.isWhitespace(quants.charAt(i))) {
					return false;
				}	
			}
		}
		return true;
	}
	// Funció que demana una cadena i declara el primer caràcter d'aquesta com a caràcter separador de la seqüència final
	public static char demanaSeparador() {
		System.out.println("Separador?");
		String cadena = Entrada.readLine();
		if (cadena.isEmpty()) {
			char separador = ',';
			return separador;
		} else {
			char separador = cadena.charAt(0);
			return separador;
		}
	}
	// funció que separa els valors de la seqüència amb el separador indicat i els mostra per pantalla
	public static String mostraSequencia(int[] numeros, char separador) {
		String sequencia = "";
		for (int i=0; i<numeros.length; i++) {
			if (i== numeros.length - 1) {
				sequencia = sequencia + numeros[i];
			} else {
				sequencia = sequencia + numeros[i] + separador + " ";
			}
		}
		return sequencia;
	}
}

		
		
	


