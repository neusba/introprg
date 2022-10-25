/* Desenvolupa un programa que demani un número enter i dibuixi tants rombos com se l'indica */

public class Rombos {
	public static void main(String[] args) {
		System.out.println("quants?");
		int numero = Integer.parseInt(Entrada.readLine());
		
		for (int repeticiones = 0; repeticiones < numero; repeticiones++) { // Bucle per repetir la figura les vegades que ense demanen
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
			// Bucle de la meitad de sota
			for (int l = 0; l < 9; l++) {
				for (int m = 0; m <= 9; m++) {
					if (m <= l) {
						System.out.print(".");
					} else {
						System.out.print(m);
					}
				}
				for (int n = 8; n >= 0; n--) {
					if (n <= l) {
						System.out.print(".");
					} else {
						System.out.print(n);
					}
				}
				System.out.println();

			}
		}	
	}
}

