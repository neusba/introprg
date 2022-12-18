/* Programa igual al anterior però aquesta vegada el valor de l'array ho donarà també l'usuari */

public class EntersEntreComes {
	public static void main(String[] args) {
		System.out.println("Quants?");
		int quants = Integer.parseInt(Entrada.readLine());
		int[] numeros = new int[quants];
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
	}
}
