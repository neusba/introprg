/* Programa que dibuixa un quadrat de 5x5 cridant a un mòdul */

public class Quadrats {
	public static void main (String[] args) {
		dibuixaQuadrat();
	}

	public static void dibuixaQuadrat() {
		for (int i=0; i < 5; i++) {
			// dibuixa una linia
			for (int j=0; j < 5; j++) {
				// Dibuixa element
				System.out.print(" X");
			}
			// Salt de linia
			System.out.println();
		}
	}
}
