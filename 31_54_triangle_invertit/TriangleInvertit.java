/* Programa que demana un nombre positiu i escriu una línia per nombre entre el nombre introduït i l'1 (decreixentment). A cada línia escriu tot els nombres desde l'1 fins al introduït */

public class TriangleInvertit {
	public static void main(String[] args) {
		System.out.println("Nombre?");
		int valorFinal = Integer.parseInt(Entrada.readLine());

		for (int i = valorFinal; i >= 1; i--) {
			for (int columna = 1; columna <= i; columna++) {
				if (columna == i) {
					System.out.print(columna);
				} else {
					System.out.print(columna + ", ");
				}
			}
			System.out.println();
		}
	}
}
