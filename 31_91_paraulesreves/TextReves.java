/* Programa que demana un text i el retorna amb les lletres de cada paraula del revés, l'ordre del text romandrà igual */

public class TextReves {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String word = ""; // String para guardar la palabra a girar letra a letra
		String textReves = ""; // String para guardar toda la frase con las palabras ya del revés
		
		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				word = word + text.charAt(i);
			} else if (Character.isWhitespace(text.charAt(i))) {
				if (Character.isLetter(text.charAt(i - 1))) {
					for (int j=word.length() - 1; j >= 0; j--) {
						textReves = textReves + word.charAt(j);
					}
				}
				textReves = textReves + text.charAt(i);
			}
		}
		System.out.println(textReves);
	}
}
