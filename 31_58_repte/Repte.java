/* Creació pròpia amb bucle for */

public class Repte {
	public static void main(String[] args) {
		
		for (int linea=0; linea <=2; linea++) {
			for (int col=0; col < 50; col++) {
				System.out.print(".");
			}
		}
		for (int lin=3; lin <10; lin++) {
			for (int col=3; col<5; col++) {
				System.out.print(".");
			}
			// Mitad izquierda paraguas
			for (int col=15; col>lin; col--) {
				if (col > lin && (col%2==0)) {
					System.out.print("  O");
				}

			}
			System.out.println();
		}
	}
}
