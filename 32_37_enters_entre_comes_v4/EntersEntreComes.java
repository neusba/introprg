/* Versió millorada de l'exercici anterior amb funcions adicionals
 * Aquesta vegada el programa demanarà a l'usuari el caràcter separador de la seqüencia
 * El programa funcionarà encara que la longitud de l'array sigui 0
 * Per cada valor introdüit, el programa cridarà al mòdul esEnter() per comprobar que tots els números són enters.
 */
public class EntersEntreComes {
	public static void main(String[] args) {
		System.out.println("Quants?");
		String quants = UtilString.esEnter(); // Llama a mòdulo esEnter
		// bucle si es entero o no
		// Convert int to String para poder crear el array con el numero indicado por el usuario
		int quantsInt = Integer.parseInt(quants);
		int[] numeros = new int[quantsInt]; // crear array con quantsInt
		// Modulo que pide separador
		// Modulo que pide los valores
		int numeroValor = 1;
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Valor %d?%n", numeroValor);
			numeros[i] = Integer.parseInt(Entrada.readLine());
			numeroValor += 1;
		}
		// modulo que muestra la sequencia con los separadores puestos
		for (int i=0; i<numeros.length; i++) {
			if (i == numeros.length - 1) {
				System.out.print(numeros[i]);
			} else {
				System.out.print(numeros[i] + ", ");
			}
		}
	}
}

