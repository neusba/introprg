/* Programa millorat de capicua: demana un text i indica si és capicua o no */

public class Capicua {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String textLletres = "";
		String textLletresReves = "";

		for (int i=0; i <= text.length() - 1; i++) {
			if (Character.isLetter(text.charAt(i))) {
				textLletres = textLletres + text.charAt(i);
			}
		}
		for (int j=textLletres.length() - 1; j >= 0; j--) {
			textLletresReves = textLletresReves + textLletres.charAt(j);
		}
		if (textLletres.equalsIgnoreCase(textLletresReves)) {
			System.out.println("És capicua");
		} else {
			System.out.println("No és capicua");
		}
	}
}

