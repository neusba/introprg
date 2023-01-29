/* Programa que simula el joc del "penjat" en el que a partir d'un fitxer amb paraules, l'usuari ha d'anar donant lletres per encertal-la
 * S'haurà de portar el seguiment de tot el procés del lloc: mostrar intents, paraules, lletres utilitzades, etc
 * Es mostraran les figures corresponents cada vegada que l'usuari falli l'intent
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Penjat {													// VARIABLES GLOBALS
	public static String currentWord;										// - - - - - - - - - - -
	public static String guessWord = "";										// paraula encriptada
	public static String letter = "";										// lletra introduida
	public static String usedLetters = "";										// lletres utilitzades
	public static int intents = 10;											// intents inicials
															// 
	public static int encertades = 0;										// paraules de resultat final
	public static int fallades = 0;											// 
	public static int cancelades = 0;										// - - - - - - - - - - - 

	public static void main(String[] args) throws IOException {							// GESTIO DEL FITXER
		String path = "paraules.txt";										// - - - - - - - - - - -
		BufferedReader input = new BufferedReader(new FileReader(path));
		
		String palabras = UtilFile.conteParaules(input);							// funcio que retorna les paraules del fitxer en un array
		if (palabras.isEmpty()) {
			System.out.print("No tinc paraules per jugar");
			return;
		}
		String words[] = UtilFile.llistaParaules(palabras);
		input.close();
		System.out.println("Comencem a jugar");
		playGame(words);											
	}
	// Comencem el joc												// INICI DEL JOC
	public static void playGame(String[] words) throws IOException {						// - - - - - - - - - - - - - - -
		for (int i=0; i<words.length; i++) {
			currentWord = words[i];										// paraula a jugar
			while (true) {
				processaEstadistica();									// estadística de la ronda
				System.out.println("Introdueix una lletra");
				letter = Entrada.readLine();
				letter = letter.toLowerCase();
				boolean checkLetter = UtilString.comprovaLletra(letter);				// LLETRA O PARAULA CLAU DEL JOC?
				if (!checkLetter) {									// - - - - - - - - - - - - - - - 
					letter = UtilString.gestionaParaulaClau(letter);
					if (letter.equalsIgnoreCase("prou")) {
						boolean sortida = UtilConfirmacio.gestionaProu();			// Comprovacions paraules clau
						if (sortida) { cancelades += 1; mostraResultat(i); return; } else { continue; }
					} else if (letter.equalsIgnoreCase("glups")) {
						cancelades += 1;
					       	break;
					} 
				}											
				letter = UtilString.buscaError(letter);							// COMPROVACIONS DE LLETRA ADEQUADA
				if (!letter.isEmpty()) {								// - - - - - - - - - - - - - - - - 
					boolean repetida = UtilString.lletraRepetida(letter, usedLetters);		// comprova lletra repetida
					if (repetida) { 
						System.out.println("La lletra ja ha estat utilitzada");
					} else { 
						usedLetters = UtilString.lletresUtilitzades(letter, usedLetters);	// retorna String de lletres utilitzades
						boolean descompta = UtilString.descomptaIntent(letter, currentWord);
						if (descompta) {
							intents -= 1;
							mostraFigura(intents);							// gestiona intents fallats
							if (intents == 0) { 
								fallades += 1;
								System.out.println("Has mort");
								break;
							}								// - - - - - - - - - - - - - - - - 
						}
						String guessWord = UtilString.situacioParaula(currentWord, usedLetters);// COMPROVACIONS DE PARAULA GUANYADA
						boolean guanya = UtilString.guanyaRonda(guessWord);			
						if (guanya) {
							encertades += 1;
							System.out.printf("Has encertat! La paraula era %s%n", currentWord);
							break;
						}                                               			// - - - - - - - - - - - - - - - - -
					}
				}							
			}
			usedLetters = "";										// RESET DE GLOBALS
			intents = 10;
			if (i == words.length - 1) {
				System.out.println("No queden més paraules");
				mostraResultat(i);
			}
		}
	}
	// Processa estadístiques de la partida										// VISUALITZACIO DE PARTIDA
	public static void processaEstadistica() {									// - - - - - - - - - - - - -	
		String guessWord = UtilString.situacioParaula(currentWord, usedLetters);				// processa estadístiques
		mostraEstadistica(guessWord);
	}
	// Mostra estadística de la partida
	public static void mostraEstadistica(String guessWord) {
		System.out.printf("Paraula: %s%n", guessWord);
		UtilString.mostraUtilitzades(usedLetters);								// mostra estadístiques de ronda
		System.out.printf("Intents disponibles: %d%n", intents);
	}
	// Mostra figura quan es descompta un intent
	public static void mostraFigura(int intents) throws IOException {
		String pathFigura = "";
		switch (intents) {
			case 9: pathFigura = "recursos/figura0.txt"; break;
			case 8: pathFigura = "recursos/figura1.txt"; break;
			case 7: pathFigura = "recursos/figura2.txt"; break;
			case 6: pathFigura = "recursos/figura3.txt"; break;						// mostra figura quan falla intent
			case 5: pathFigura = "recursos/figura4.txt"; break;
			case 4: pathFigura = "recursos/figura5.txt"; break;
			case 3: pathFigura = "recursos/figura6.txt"; break;
			case 2: pathFigura = "recursos/figura7.txt"; break;
			case 1: pathFigura = "recursos/figura8.txt"; break;
			case 0: pathFigura = "recursos/figura9.txt"; break;
		}
		UtilFile.visualitzacioFigura(pathFigura);
	}
	// Mostra resultat final de la partida
	public static void mostraResultat(int jugades) {
		System.out.printf("Paraules jugades: %d%n", jugades + 1);
		System.out.printf("Paraules encertades: %d%n", encertades);
		System.out.printf("Paraules fallades: %d%n", fallades);							// mostra resultat final de la partida
		System.out.printf("Paraules cancel·lades: %d%n", cancelades);
		System.out.printf("Espero que t'hagis divertit%n");
	}
}
