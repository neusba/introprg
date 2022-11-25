/* Programa que dibuixa un quadrat de 5x5 cridant a mòduls */

public class Quadrats {
	public static void main(String[] args) {
		dibuixaQuadrats();
	}

	// dibuixa un quadrat de 5x5
	public static void dibuixaQuadrats() {
		System.out.println("Quants?");
		int numero = Integer.parseInt(Entrada.readLine());
		for (int q=0; q < numero; q++) {
			dibuixaQuadrat();
		}
	}

	public static void dibuixaQuadrat() {
		for (int i=0; i < 5; i++) {
			for (int j=0; j < 5; j++) {
				System.out.print(" X");
			}
			// salt de linia
			System.out.println();
		}
		System.out.println();
	}
}
