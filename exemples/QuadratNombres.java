/* Programa que demani un enter positiu més gran que 0 i dibuixi un quadrat amb els nombres del 1 fins el valor de l'entrada */

public class QuadratNombres {
        public static void main(String[] args) {
		System.out.println("Valor final?");
		int valorFinal = Integer.parseInt(Entrada.readLine());

		for (int i = 1; i <= valorFinal; i++) {
			for (int columna = 1; columna <= valorFinal; columna++) {
				if (columna % 2 == 0) {
					System.out.print("X");
				} else { 
					System.out.print(".");
				}
			}
			System.out.println();
		}	
	}
}

