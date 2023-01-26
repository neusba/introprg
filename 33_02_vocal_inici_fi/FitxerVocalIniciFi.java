/* Programa que llegeix las paraules d'un fitxer i mostra per pantalla totes les que comencen o acaben en vocal catalana
 * El fitxer de les paraules s'anomenarà frases.txt
 * Haurem d'utilitzar la funció ja creada esVocal();
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FitxerVocalIniciFi {
	public static void main(String[] args) throws IOException {
		String path = "frases.txt";						// arxiu dins del mateix directori
		BufferedReader entrada = new BufferedReader(new FileReader(path));	// preparem l'arxiu i l'obrim
			
		while (true) {
			String linia = entrada.readLine();				// llegim la primera línea de l'arxiu	
			if (linia == null) break;
			boolean checkVocal = UtilString.esVocal(linia);
			if (checkVocal) {
				System.out.println(linia);
			}
		}
		entrada.close();							// tanquem l'arxiu quan acabem
	}
}


