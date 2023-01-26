/* Funcions per fitxers */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UtilFile {
	// Funcion que devuelve un array con las palabras que se jugaran
	public static String[] llistaParaules(BufferedReader input) throws IOException {
		String paraules = "";
		String linia = input.readLine();
		while (linia != null) {
			paraules = paraules + linia + ",";
			linia = input.readLine();
		}
		if (paraules.isEmpty()) {
			System.out.println("No tinc paraules per jugar");
		}
		String[] words = paraules.split(",");
		return words;
	}

	// Modifica la visualització de la paraula durant la partida
	public static String situacio

}


