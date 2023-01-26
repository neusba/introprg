/* Programa que simula el joc del "penjat" en el que a partir d'un fitxer amb paraules, l'usuari ha d'anar donant lletres per encertal-la
 * S'haurà de portar el seguiment de tot el procés del lloc: mostrar intents, paraules, lletres utilitzades, etc
 * Es mostraran les figures corresponents cada vegada que l'usuari falli l'intent
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Penjat {
	public static String currentWord;
	public static void main(String[] args) throws IOException {
		String path = "paraules.txt";								// fitxer al mateix directori
		BufferedReader input = new BufferedReader(new FileReader(path));
		
		String[] words = UtilFile.llistaParaules(input);					// funcion que devuelve las palabras en una lista
		if (words == null) {
			System.out.print("No tinc paraules per jugar");
			return;
		}
		input.close();
		playGame(words);									// inicia el joc
	}

	// Comencem el joc
	public static void playGame(String[] words) {
		System.out.println("Comencem a jugar");
		// mostrem la primera paraula
		for (int i=0; i<words.length; i++) {
			currentWord = words[i];								// paraula a jugar
			mostraSituacio();								// situació inicial de joc
		}
	}

	// Estadística del joc
	public static void mostraSituacio() {
		String paraula = UtilFile.situacioParaula(currentWord);
		// Paraula: ****
		// Utilitzades: cap
		// Intents disponibles
	}
}
