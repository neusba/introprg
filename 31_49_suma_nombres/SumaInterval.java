/* Programa que demana 2 números enters a l'usuari i suma tots els que hi ha entre un i l'altre, ambdós inclosos */

public class SumaInterval {
	public static void main(String[] args) {
		System.out.println("inici?");
		int i = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int f = Integer.parseInt(Entrada.readLine());
		int suma = 0;

		// Si la seqüència es creixent, fem un increment positiu
		if (i <= f) {
			for (; i <= f; i++) {
				suma += i;
			}
		} else if (i > f) {
			for (; i >= f; i--) {
				suma += i;
			}
		}

		// Finalment mostrem la suma
		System.out.println(suma);
	}
}


