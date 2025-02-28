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
		if (quantsInt < 0) {
			System.out.println("Res a fer");
			return;
		}
		int[] numeros = new int[quantsInt];
		char separador = UtilString.demanaSeparador();
		numeros = UtilString.demanaValor(numeros);
		String sequencia = UtilString.entreComes(numeros, separador);
		System.out.println(sequencia);
	}
}
			
