/* Programa que demani un enter positiu més gran que zero i dibuixi un quadrat amb els nombres del 1 fins el valor de l'entrada */

public class QuadratNombres {
	public static void main(String[] args) {

		System.out.println("Valor final?");
		int valorFinal = Integer.parseInt(Entrada.readLine());

		if (valorFinal <= 0 || valorFinal >= 10) {
			System.out.println("Valor inadequat");
		} else {
			for (int i = 1; i <= valorFinal; i++) {
				for (int columna = 1; columna <= valorFinal; columna++) {
					System.out.print(" "  + columna);
				}
				System.out.println();
			}
		}
	}
}
