/* Funcions per l'exercici 33_03
 */

public class UtilString {
	// funció que separa els elements de la linea per comes
	public static String[] extreuElements(String linia) {
		String[] elements = linia.split(",");
		return elements;
	}

	// funcio que extreu el nom de la llista d'elements de la linia
	public static String extreuNom(String[] elements) {
		String nom = elements[0];
		return nom;
	}

	// funcio que extreu les notes de cad alumne
	public static String sumaNotes(String[] elements) {
		String tmp = "";
		String notes = "";
		for (int i=0; i<elements.length; i++) {						// recorrem l'array dels elements de la línia
			for (int j=0; j<elements[i].length(); j++) {				// recorrem cada element individualment
				if (elements[i].length() > 1) continue;
				tmp = elements[i];
				char temp = tmp.charAt(0);
				if (Character.isDigit(temp)) {
					notes = notes + temp;
				}
			}
		}
		return notes;
	}

	// funcio que retorna la nota mitja de cada alumne
	public static int notaTotal(String notes) {
		int mitja = 0;
		for (int i=0; i<notes.length(); i++) {
			String tmp = "";
			if (Character.isDigit(notes.charAt(i))) {
				tmp = tmp + notes.charAt(i);
				int nota = Integer.parseInt(tmp);
				mitja += nota;
			}
		}
		return mitja;
	}
}
				

			
