/* Programa que demana un text i el retorna invertint l'ordre de les lletres i el dígits */

public class TextReves {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String textReves = "";
		int contador = 0; // Cada vegada que es col·loqui una lletra del String invers sumarem 1 per no perdre la lletra quan j sigui Whitespace.

		for (int i=text.length() - 1; i >= 0; i--) {
			if (Character.isLetter(text.charAt(i)) || Character.isDigit(text.charAt(i))) {
				textReves = textReves + text.charAt(i);
			}
		}
		for (int j=0; j < text.length(); j++) {
			for (int k=contador; k < textReves.length(); k++) {
				if (Character.isLetter(text.charAt(j)) || Character.isDigit(text.charAt(j))) {
					System.out.print(textReves.charAt(k));
					contador += 1;
				} else {
					System.out.print(text.charAt(j));
				}
			break;
			}
		}
	}
}

