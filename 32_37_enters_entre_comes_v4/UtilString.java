/* Funcions per l'exercici 32_37
 * Aquesta vegada l'usuari podrà escollir el caràcter separador de la seqüència
 * Utilitzarem el mòdul esEnter() per comprobar si un string donat és un nombre enter o no
 */
public class UtilString {
	// funció que comprova si el String donat és un nombre enter o no
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
	// funció que demana a l'usuari un separador per la seqúència final
	public static char demanaSeparador() {
		System.out.println("Separador?");
		String cadena = Entrada.readLine();
		char separador;
		if (cadena.isEmpty()) {
			separador = ',';
			return separador;
		} else {
			separador = cadena.charAt(0);
			return separador;
		}
	}
	// funció que retorna l'array amb tots els valors corresponents
	public static int[] demanaValor(int[] numeros) {
		int numeroValor = 1;
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Valor %d?%n", numeroValor);
			String valor = Entrada.readLine();
			boolean esEnter = esEnter(valor);
			while (!esEnter) {
				System.out.println("Per favor, un valor enter");
				valor = Entrada.readLine();
				esEnter = esEnter(valor);
			}
			int valorInt = Integer.parseInt(valor);
			numeros[i] = valorInt;
			numeroValor += 1;	
		}
		return numeros;
	}
	// funció que separa l'array amb el separador corresponent i el mostra per pantalla
	public static String entreComes(int[] numeros, char separador) {
		String sequencia = "";
		for (int i=0; i<numeros.length; i++) {
			if (i == numeros.length - 1) {
				sequencia = sequencia + numeros[i];
			} else {
				sequencia = sequencia + numeros[i] + separador + " ";

			}
		}
		return sequencia;
	}
}

