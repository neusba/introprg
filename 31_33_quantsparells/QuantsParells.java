/* Programa que demani números enters positius a l'usuari i que quan rebi un negatiu, mostri el nombre de números parells introduïts i finalitzi el programa */

public class QuantsParells {
	public static void main(String[] args) {

		// Declarem les variables per al valor que introdueix l'usuari i per al contador de nombres parells
		int valor = 0; // Inicialitzem la variable en 0 per a que ens serveixe la primera vegada del bucle i ens estalviem repetir el codi
		int contadorParells = 0;

		// Iniciem el bucle while
		while (valor >= 0) {
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
			// Creem una condició per anar contant els nombres parells 
			if (valor % 2 == 0 && valor >= 0) {
				contadorParells = contadorParells + 1; // (?)Añadir también los números negativos al contador de parells(?)
			}
		}

		// Mostrem el contador de nombre parells en el moment que termina el bucle
		System.out.println("Nombre de parells introduïts: " + contadorParells);
	}
}
			
