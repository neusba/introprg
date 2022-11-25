/* Programa que dibuixa un quadrat de 5x5 cridant a un mòdul */

public class Quadrats {
	public static void main (String[] args) {
		dibuixaQuadrat();
	}

	public static void dibuixaQuadrat() {
		System.out.println("Quants?");
		int numero = Integer.parseInt(Entrada.readLine());
		for (int i=0; i < numero; i++) {
			// dibuixa un quadrat
			for (int fila=0; fila < 5; fila++) {
				// Dibuixa linia
				for (int col=0; col < 5; col++) {
					// Dibuixa element
					System.out.print(" X");
				}
				// Salt de linia
				System.out.println();
			}
			System.out.println();
		}
	}
}
