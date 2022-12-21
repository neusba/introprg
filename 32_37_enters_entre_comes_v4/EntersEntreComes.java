/* Nova versió del programa entre comes * Aquesta vegada l'usuari decidirà quin és el caràcter que separarà la seqüència * 
 * Quan l'array tingui longitud 0, el mòdul que mostra la seqüència final funcionarà de totes formes
 * Haurem de comprobar que els nombres intrduïts són enters per poder continuar
 */
public class EntersEntreComes {
	public static void main(String[] args) {
		String quants = UtilString.demanaQuantitat();
		boolean esEnter = UtilString.esEnter(quants);
		while (!esEnter) {
			System.out.println("Per favor, un valor enter");
			quants = UtilString.demanaQuantitat();
			esEnter = UtilString.esEnter(quants);
		}
		int quantsInt = Integer.parseInt(quants);
		if (quantsInt < 0) {
			quantsInt = 0;
		}
	       	char separador = UtilString.demanaSeparador();
		int[] numeros = new int[quantsInt];
		int numeroValor = 1;
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Valor %d?%n", numeroValor);
			String valor = Entrada.readLine();
			esEnter = UtilString.esEnter(valor);
			while (!esEnter) {
				System.out.println("Per favor, un valor enter");
				valor = Entrada.readLine();
			}
			int valorArray = Integer.parseInt(valor);
			numeros[i] = valorArray;
			numeroValor += 1;
		}
		String sequencia = UtilString.mostraSequencia(numeros, separador);
		System.out.println(sequencia);
	}
}
