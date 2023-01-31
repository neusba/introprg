/* Funcions per l'exercici 33_08 
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UtilString {
	// globals
	public static boolean matriculaItalianaValida(String text) throws IOException {
		text = text.strip();
		if (text.length() != 7) {
			return false;
		}
		for (int i=0; i < text.length(); i++) {
			char lletra = text.charAt(i);
			if (i > 1 && i < 5) {
				if (!Character.isDigit(lletra)) {
					return false;
				}
			} else {
				boolean valida = esLletraValidaPerMatriculaItaliana(lletra);
				if (!valida) {
					return false;
				}
			}
		}
		return true;
	}
	// revisio de les lletres de la matricula
	public static boolean esLletraValidaPerMatriculaItaliana(char lletra) throws IOException {
		String noValides = "IOQU";
		if (Character.isLetter(lletra) && Character.isUpperCase(lletra)) {
			if (lletra >= 'A' && lletra <= 'Z') {
				for (int i=0; i < noValides.length(); i++) {
					if (lletra == noValides.charAt(i)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
}

			
			
		
		
