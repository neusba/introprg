/* Programa que demani un nombre enter positiu i dibuixi tants triangles com se l'indiqui */

public class Triangle {
	public static void main(String[] args) {
		System.out.println("quants?");
		int numero = Integer.parseInt(Entrada.readLine());
	  	
		for (int repeticiones = 0; repeticiones < numero; repeticiones++) {	
			for (int i = 9; i >= 0; i--) { // Iniciem el bucle de les línies de les que constarà el triangle
				for (int j = 0; j <= 9 ; j++) { // Aquest segon bucle són les columnes que s'imprimiran per pantalla
					if (j < i) {
						System.out.print("."); // Si el número és més petit que la variable i, es mostrarà un punt, sinó el número corresponent (j)
					} else {
						System.out.print(j);
					}
				}
				for (int k = 8; k >= 0; k--) { // Aquest bucle dins del primer bucle i seguit del segon es per fer el mateix però desde l'altre costat i a l'inversa.
					if (k < i) {
						System.out.print(".");
					} else {
						System.out.print(k);
					}	
				}	
				System.out.println();
			}
			System.out.println();
		}	
	}
}
		 
