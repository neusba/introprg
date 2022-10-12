/* Programa que demani números enters positiu per pantalla i que quan rebi un negatiu, mostri el número positiu màxim introduït i finalitzi el programa */

public class TrobaMaxim {
	public static void main(String[] args) {
		// Declarem les variables necessàries
		int valor = 0; // Inicialitzem en cero per no haber de repetir codi més endavant
		int valorMaxim = 0; // El valor màxim comença sent igual al primer valor llegit
		
		// Creem el bucle while
		while (valor >= 0) {
			if (valor > valorMaxim) {
				valorMaxim = valor;
			}
			// Demanem el següent valor a l'usuari
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
		}

		// Quan termina el bucle, imprimim el valr màxim
		System.out.println("El màxim és " + valorMaxim);
	}
}
