/* Programa que demani notes a l'usuari entre el 0 i el 100 i quan superi aquest números et mostri per pantalla la mitja de totes les notes */

public class NotaMitja {
	public static void main(String[] args) {

		// Declarem les variables necessàries
		int valor = 0; // Inicialitzem en cero per estalviar repetir codi
		int acumulador = 0; // Acumulador de notes introduïdes
		int suma = 0; // Variable per anar sumant totes les notes

		// Creem el bucle while
		while (valor >= 0 && valor <= 100) {
			suma = suma + valor;
			acumulador = acumulador + 1;
			// Demanem la nota a l'usuari
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
		}
		
		// Creem la condició en cas de que la nota introduïda sigui diferent
		if ((valor < 0 && valor > 100) && acumulador == 1) {
			System.out.println("Cap nota vàlida introduïda");
		} else {
			// Si la nota introduïda no és negativa, llavors imprimim el missatge final
			System.out.println("La mitja de les notes vàlides és " + (suma/acumulador));
		}
	}
}
