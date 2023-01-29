/* Utilitats de String per l'exercicic 33_04 */

public class UtilString {

	/* ################### PARAULA EN JOC ###################### */

	// Visualització de la paraula en joc
	public static String situacioParaula(String currentWord, String usedLetters) {
		String guessWord = "";
		if (usedLetters.isEmpty()) {								
			guessWord = paraulaOculta(currentWord);
		} else {
			guessWord = destapaLletra(currentWord, usedLetters);
		}
		return guessWord;
	}
	// Funcio que retorna un String amb totes les lletres ocultes amb *				// No s'ha introduit cap lletra encara
	public static String paraulaOculta(String currentWord) {
		String guessWord = "";
		for (int i=0; i<currentWord.length(); i++) {
			guessWord = guessWord + "*";
		}
		return guessWord;
	}
	// Funcio que retorna un String amb les lletres utilitzades destapades a la paraula		
	public static String destapaLletra(String currentWord, String usedLetters) {
		String guessWord = "";
		for (int i=0; i<currentWord.length(); i++) {						// Mostra la paraula modificada amb cada lletra que entra
			boolean check = false;								// false = no destapa letra | true = destapa letra
			for (int j=0; j<usedLetters.length(); j++) {
				if (currentWord.charAt(i) == usedLetters.charAt(j)) {
					guessWord = guessWord + currentWord.charAt(i);
					check = true;
				}
			}
			if (!check) {
				guessWord = guessWord + "*";
			}	
		}
		return guessWord;
	}
	
	/* ################ LLETRES UTILITZADES ################### */

	// Funcio que acumula les lletres utilitzades en un string i el retorna
	public static String lletresUtilitzades(String letter, String usedLetters) {
		usedLetters = usedLetters + letter;							// Acumula les lletres utilitzades
		return usedLetters;
	}
	// Procediment de la visualització de les paraules utilitzades 
	public static void mostraUtilitzades(String usedLetters) {
		usedLetters = usedLetters.toUpperCase();
		System.out.print("Utilitzades: ");
		int length = usedLetters.length();
		if (length == 0) {
			System.out.println("cap");
			return;
		}
		for (int i=0; i<usedLetters.length(); i++) {
			if (length == 1) {
				System.out.printf("%c%n", usedLetters.charAt(i));			// Visualitzacio lletres utilitzades
			} else if (length == 2) {
				if (i == 0) {
					System.out.printf("%c i ", usedLetters.charAt(i));
				} else {
					System.out.printf("%c%n", usedLetters.charAt(i));
				}
			} else {
				if (i == 0) {
					System.out.printf("%c, ", usedLetters.charAt(i));
				} else if (i == usedLetters.length() - 1) {
					System.out.printf("i %c%n", usedLetters.charAt(i));
				} else if (i == usedLetters.length() - 2) {
					System.out.printf("%c ", usedLetters.charAt(i));
				} else {
					System.out.printf("%c, ", usedLetters.charAt(i));
				}
			}
		}
	}

	/* ################# COMPROVACIONS  ############# */

	// Comprova si l'entrada és una lletra o una paraula clau del joc
	public static boolean comprovaLletra(String letter) {
		int length = letter.length();
		if (length > 1) { return false; }
		return true;
	}	
	// Comprova si l'entrada introduida és una de les paraules claus del joc o un error
	public static String gestionaParaulaClau(String letter) {
		if (letter.equalsIgnoreCase("prou") || letter.equalsIgnoreCase("glups")) { return letter;
		} else {
			System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
		}
		return "";												
	}
	// Comprova si la lletra és un buit o un dígit no vàlid
	public static String buscaError(String letter) {
		if (letter.isEmpty()) { 
			System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
			return "";											// Si l'entrada es "", retorna  buit
		}
		char lletra = letter.charAt(0);
		if (Character.isDigit(lletra)) {
			System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
			return "";											// Si l'entrada es digit, retorna buit
		}
		return letter;												// Si és un lletra, la retorna
	}
	// Comprova si la lletra esta repetida
	public static boolean lletraRepetida(String letter, String usedLetters) {
		char lletra = letter.charAt(0);
		if (usedLetters.isEmpty()) {
			return false;
		} else {
			for (int i=0; i<usedLetters.length(); i++) {
				if (lletra == usedLetters.charAt(i)) {
					return true;
				}
			}
		}
		return false;
	}
	// Comprova si la lletra es trova a la paraula i descompta l'intent en cas de que no
	public static boolean descomptaIntent(String letter, String currentWord) {
		char lletra = letter.charAt(0);
		for (int i=0; i<currentWord.length(); i++) {
			if (lletra == currentWord.charAt(i)) { return false; }
		}
		return true;
	}
	// Comprova si l'usuari ha encertat la paraula
	public static boolean guanyaRonda(String guessWord) {
		for (int i=0; i<guessWord.length(); i++) {
			if (guessWord.charAt(i) == '*') {
				return false;
			}
		}
		return true;
	}

}
