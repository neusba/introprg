/* Versió millorada del exercici 31_81, el qual consistia en posar totes les inicials d'un text donar per l'usuari en majúscula */

public class MajusculitzaInicials {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Text?");
		String text = Entrada.readLine();
		majusculitzaInicials(text);
	}
	// convertim en majúscula les inicials
	public static void majusculitzaInicials(String text) {
		String nouText = "";
		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				if (i == 0) {
					nouText = nouText + Character.toUpperCase(text.charAt(i));
				} else if (Character.isWhitespace(text.charAt(i - 1)) || !Character.isLetter(text.charAt(i - 1))) {
					nouText = nouText + Character.toUpperCase(text.charAt(i));
				} else {
					nouText = nouText + text.charAt(i);
				}
			} else {
				nouText = nouText + text.charAt(i);
			}
		}
		System.out.println(nouText);
	}
}

