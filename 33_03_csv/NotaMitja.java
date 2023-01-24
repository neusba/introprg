/* Programa que calcularà la nota mitjà de cada alumne a la llista del fitxer especificat
 * Ignorarem la primera línia del fitxer ja que correspon a capçaleres
 * Si hi ha cap nota, es motrarà el missatge "Cap entrada"
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class NotaMitja {
	public static void main(String[] args) throws IOException {
		String path = "notes.csv";							// fitxer dins del mateix directori
		BufferedReader input = new BufferedReader(new FileReader(path));
		int comptaLinies = 0;								// Va sumant 1 cada vegada que hi ha una línia al fitxer
		
		while (true) {
			String linia = input.readLine();
			if (linia == null) {
				if (comptaLinies == 1) {
					System.out.println("Cap entrada");
				}
				break;
			}
			comptaLinies += 1;
			if (comptaLinies == 1) {
				continue;
			} else {
				String[] elements = UtilString.extreuElements(linia);
				String nom = UtilString.extreuNom(elements);
				String notes = UtilString.sumaNotes(elements);
				int mitja = UtilString.notaTotal(notes);
				System.out.printf("%s (%.2f)%n", nom, mitja/6.0);
			}
		}
		input.close();

	}
}
		
