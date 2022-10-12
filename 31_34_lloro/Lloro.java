/* Programa que demani paraules a l'usuari i es vagin repetint fins que es doni una entrada en blanc */

public class Lloro {
	public static void main(String[] args) {

		// Demanem la paraula a l'usuari
		System.out.println("El lloro espera la paraula:"); 
		String word = Entrada.readLine();
		
		// Iniciem el bucle while
		while (word.isEmpty() == false && word.isBlank() == false) {	
			System.out.println("El lloro repeteix: " + word);
			// Tornem a demanar la paraula
			System.out.println("El lloro espera la paraula:");
			word = Entrada.readLine();
		}
		
		// Finalitzem el programa
		System.out.println("Adéu");
	}
} 
