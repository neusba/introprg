/* Programa que demani notes a l'usuari entre el 0 i el 100 i quan superi aquest números et mostri per pantalla la mitja de totes les notes */

public class NotaMitja {
	public static void main(String[] args) {

		// Declarem les variables necessàries
		int nota = 0; // Inicialitzem en cero per estalviar repetir codi
		int acumulador = 0; // Acumulador de notes introduïdes
		int suma = 0; // Variable per anar sumant totes les notes

		// Creem el bucle while
		while (nota >= 0 && nota <= 100) {
			suma = suma + nota;
			acumulador = acumulador + 1;
			// Demanem un altre vegada la nota
			System.out.println("Introdueix un valor");
			nota = Integer.parseInt(Entrada.readLine());
		}
		// Si la nota introduïda està fora del rang
		if ((nota < 0 || nota > 100) && acumulador == 1) {
			System.out.println("Cap nota vàlida introduïda");
		}

	}
}
