/* Practicando triangulos para el pinche examen */

public class PracticaTriangulo {
	public static void main(String[] args) {
		// Triangulo 0..9
		for (int i=9; i >= 0; i--) {
			for (int j=0; j <= 9; j++) {
				if (j < i) {
					System.out.print(".");
				} else {
					System.out.print(j);
				}
			}
		System.out.println();
		}
		// Triangle descendent numerico creixent
		for (int i=9; i >= 0; i--) {
			for (int j=9; j >= i; j--) {
				if (j >= i) {
					System.out.print(j);
				} else {
					System.out.print(".");
				}
			}
		System.out.println();
		}		
	}
}

