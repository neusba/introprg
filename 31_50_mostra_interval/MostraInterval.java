/* Programa que demana dos valors enters a l'usuari i mostra tots els enters que hi ha entre un i l'altra, ambdós inclosos */

public class MostraInterval {
	public static void main(String[] args) {
		System.out.println("inici?");
		int i = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int f = Integer.parseInt(Entrada.readLine());

		// Si la seqüència és creixent, l'increment és positiu
		if (i <= f) {
			for (; i <= f; i++) {
				System.out.println(i);
			}
		} else if (i >= f) {
			for (; i >= f; i--) {
				System.out.println(i);
			}
		}
	}
}
