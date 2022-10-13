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
			// Demanem la nota a l'usuari
			System.out.println("Introdueix un valor");
			nota = Integer.parseInt(Entrada.readLine());
		} 
		
		if (nota < 0 || nota > 100) {
			System.out.println("Cap nota vàlida introduïda");
		} else {
			System.out.println("La mitja de les notes vàlides és " + (suma/acumulador));
		}
		 
	}
}
