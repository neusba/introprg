/* Programa que demana un número a l'usuari i dibuixa tants quadrats com número indicat */

public class Quadrats {
	public static void main (String[] args) {
		System.out.println("Quants?");
		int numero = Integer.parseInt(Entrada.readLine());
		
		// Creem el bucle per el número de repeticions de quadrats
		for (int i=0; i < numero; i++) {
			// Dibuixa un quadrat 
			for (int fila=0; fila < 5; fila++) {
				// Dibuixa una linia
				for (int col=0; col < 5; col++) {
					// Dibuixa un element
					System.out.print(" X");
				}
				// Dibuixa un salt de linia
				System.out.println();
			}
			System.out.println();
		}
	}
}

