/* Programa que demana les notes dels alumnes i les va sumant sempre i quan estiguin en un rang de 0 a 100, sinó pararà. */

public class SumaNotes {
	public static void main (String[] args) {
		
		// Declarem la suma de les notes i el valor de la nota que donarà l'usuari en unes variables
		int nota;
		int sumaNotes = 0;

		// Demanem la primera nota a l'usuari
		System.out.println("Introdueix una nota");
		nota = Integer.parseInt(Entrada.readLine());
		// Fiquem el bucle While
		while (nota > 0 && nota < 100) {
			sumaNotes = sumaNotes + nota;
			// Ens torna a demanar un valor
			System.out.println("Introdueix una nota");
			nota = Integer.parseInt(Entrada.readLine());
		}
		// Quan el bucli termini, imprimim la suma de les notes
		System.out.println("La suma de les notes vàlides és " + sumaNotes);
	}
}
		
