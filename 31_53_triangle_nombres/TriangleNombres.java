/* Programa que demani un nombre positiu més gran que 0 i escrigui una línia per nombre entre l'1 i el número d'entrada i cada línia escriurà tots els nombres desde l'entrada fins l'1 */

public class TriangleNombres {
	public static void main(String[] args) {
		System.out.println("Nombre?");
		int valorFinal = Integer.parseInt(Entrada.readLine());
		
		for (int i = 1; i <= valorFinal; i++) {
			for (int columna = i; columna >= 1; columna--) {
				System.out.print(" " + columna);
			} 
			System.out.println();
		}
	}
}
