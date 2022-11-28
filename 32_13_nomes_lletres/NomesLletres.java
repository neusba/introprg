/* Versió millorada del exercici 31_72, el qual demanava un text i retornava només les lletres separades per comes */

public class NomesLletres {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Text?");
		String text = Entrada.readLine();
		String nouText = "";
		filtraLletres(text, nouText);
	}
	// filtrem les lletres
	public static void filtraLletres(String text, String nouText) {
		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				nouText = nouText + text.charAt(i);
			}
		}
		mostraLletres(nouText);
	}
	// mostrem les lletres amb comes
	public static void mostraLletres (String nouText) {
		for (int j=0; j < nouText.length(); j++) {
			if (j == nouText.length() - 1) {
				System.out.print(nouText.charAt(j));
			} else {
				System.out.print(nouText.charAt(j) + ", ");
			}
		}
	}
}

