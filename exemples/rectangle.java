/* Rectangulo examen ej 4 */

public class rectangle {
	public static void main(String[] args) {
		int files = Integer.parseInt(Entrada.readLine());
		int columnes = Integer.parseInt(Entrada.readLine());

		for (int i=1; i <= files; i++) {
			for (int j=1; j <= columnes; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

