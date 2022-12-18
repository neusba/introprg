/* Programa que mostra els nombres enters separats per comes que es troben agrupats en un array
 */
public class EntersEntreComes {
	public static void main(String[] args ) {
		// declaració del array
		int[] numeros;
		numeros = new int[3];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		for (int i=0; i<numeros.length; i++) {
			if (i == numeros.length - 1) {
				System.out.print(numeros[i]);
			} else {
				System.out.print(numeros[i] + ", ");
			}
		}
		System.out.println();
	}
}

