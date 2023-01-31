/* Funcions de fitxers */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UtilFile {
	// funcion que comprueba si el archivo leido esta vacio o tiene contenido
	public static boolean comprovaContingut(BufferedReader input) throws IOException {
		int control = 0;
		while (true) {
			String linia = input.readLine();
			if (linia == null) {
				if (control == 0) {
					input.close();
					return false;
				}
				break;
			}
			control += 1;
		}
		input.close();
		return true;
	}
}
