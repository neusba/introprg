/* Programa que tè per defecte el nombre 42 i demana números a l'usuari fins que encerta, mostra missatges diferents segons si s'allunya o s'apropa o està fora de rang */

public class EndevinaNombre {
	public static void main(String[] args) {
		// El nombre a encertar és el 42
			
		System.out.println("Ves introduïnt enters entre 1 i 100 fins que encertis el que jo he pensat");
		int valor = Integer.parseInt(Entrada.readLine());

		while (valor >= 1 && valor <= 100) {
			// Creem les condicions respondre a l'usuari segons la resposta
			if (valor < 42) {
				System.out.println("És més gran que " + valor);
			} else if (valor > 42) {
				System.out.println("ÉS més petit que " + valor);
			} else {
				System.out.println("Has encertat!");
			}
			// Demanem el valor a l'usuari
			valor = Integer.parseInt(Entrada.readLine());
		}

		// Si el bucle termina fem les dos condicions restants
		if (valor <= 0) {
			System.out.println("Com a mínim 1");
		} else {
			System.out.println("Com a màxim 100");
		}
	}
}

