/* Funcions per fitxers
 * La primera funcio fica les paraules del text en un array de String separat per comes
 * La segona funció comprova si n'hi ha paraules al fitxer i les retorna en un string separades per comes
 * El tercer procediment mostra l'interior dels fitxers de les figures cada vegada que es perd un intent
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UtilFile {

	// ################## UTILITATS DE FITXERS ################# // 
	
	// Funcion que fica totes les paraules existents al text en un array separades per comer
	public static String[] llistaParaules(String palabras) throws IOException {
		String words[] = palabras.split(",");
		return words;
	}	
	// Funcion que devuelve un array con las palabras que se jugaran
	public static String conteParaules(BufferedReader input) throws IOException {
		String palabras = "";
		String linia = input.readLine();
		while (true) {
			if (linia == null) { break; }
			palabras = palabras + linia + ",";
			linia = input.readLine();
		}
		return palabras;
	}
	// Visualització del fitxer de la figura corresponent quan es perd un intent
	public static void visualitzacioFigura(String pathFigura) throws IOException {
		BufferedReader inputFigura = new BufferedReader(new FileReader(pathFigura));
		while (true) {
			String linia = inputFigura.readLine();
			if (linia == null) { break; }
			System.out.println(linia);
		}
		inputFigura.close();
	}
			
		
		
}


