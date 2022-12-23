/* Versió millorada de l'exercici anterior amb funcions adicionals
 * Aquesta vegada el programa demanarà a l'usuari el caràcter separador de la seqüencia
 * El programa funcionarà encara que la longitud de l'array sigui 0
 * Per cada valor introdüit, el programa cridarà al mòdul esEnter() per comprobar que tots els números són enters.
 */
public class EntersEntreComes {
	public static void main(String[] args) {
		System.out.println("Quants?");
		String quants = Entrada.readLine();
		boolean esEnter = UtilString.esEnter(quants);
		while (!esEnter) {
			System.out.println("Per favor, un valor enter");
			quants = Entrada.readLine();
			esEnter = UtilString.esEnter(quants);
		}
		int quantsInt = Integer.parseInt(quants);
		if (quantsInt < 1) {
			quantsInt = 0;
		}
		int[] numeros = new int[quantsInt];
		String separador = UtilString.demanaSeparador();
		numeros = UtilString.demanaValor(numeros);
		mostraSequencia(numeros, separador);
	}
	// funció que separa l'array amb el separador corresponent i el mostra per pantalla
	public static void mostraSequencia(int[] numeros, String separador) {
		for (int i=0; i<numeros.length; i++) {
			if (i == numeros.length - 1) {
				System.out.print(numeros[i]);
			} else {
				System.out.print(numeros[i] + separador + " ");

			}
		}
	}
}
			
