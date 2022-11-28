/* Versió millorada del exercici 31_78, el qual consistia en transformar les vocals d'un text donar per l'usuari en majúscules  */

public class VocalsMajuscules {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Text?");
		String text = Entrada.readLine();
		majusculitzaVocals(text);
	}
	// transformem el text
	public static void majusculitzaVocals(String text) {
		text = text.toLowerCase();
		String vocals = "aeiou";
		String nouText = "";
		for (int i=0; i < text.length(); i++) {
			boolean vocal = false;
			if (Character.isLetter(text.charAt(i))) {
				for (int j=0; j < vocals.length(); j++) {
					if (text.charAt(i) == vocals.charAt(j)) {
						nouText = nouText + Character.toUpperCase(text.charAt(i));
						vocal = true;
					}
				}
				if (!vocal) {
					nouText = nouText + text.charAt(i);
				}
			} else {
				nouText = nouText + text.charAt(i);
			}
		}
		System.out.println(nouText);
	}
}
