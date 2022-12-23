/* Versió més completa del exercici anterior
 * Aquesta vegada els valors de l'array el determinarà l'usuari, suposarem que els valors d'entrada són sempre enters vàlids
 * L'array tindrà 5 valors
 */
public class EntersEntreComes {
	public static void main(String[] args) {
		int[] numeros = new int[5];
		int numeroValor = 1;
		for (int i=0; i<numeros.length; i++) {
			System.out.printf("Valor %d?%n", numeroValor);
			numeros[i] = Integer.parseInt(Entrada.readLine());
			numeroValor += 1;
		}
		for (int i=0; i<numeros.length; i++) {
			if (i == numeros.length - 1) {
				System.out.print(numeros[i]);
			} else {
				System.out.print(numeros[i] + ", ");
			}
		}
		System.out.println(numeros);
	}
}
