/* Funcions per fitxers */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UtilFile {

	// ################## UTILITATS DE FITXERS ################# // 
	
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
	
	// Visualització del fitxer de la figura corresponent quan es perd un intent
	public static void visualitzacioFigura(String pathFigura) throws IOException {
		BufferedReader inputFigura = new BufferedReader(new FileReader(pathFigura));
		while (true) {
			String linia = inputFigura.readLine();
			if (linia == null) { break; }
			System.out.println(linia);
		}
	}
			
		
		
}


