/* Programa que demana un text i el retorna amb les lletres de cada paraula del revés, l'ordre del text romandrà igual */

public class ParaulesReves {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String lletres = "";
		String lletresReves = "";
		
		for (int i=0; i < text.length(); i++) {
			if (Character.isWhitespace(text.charAt(i))) {
				lletresReves = lletresReves + lletres + " ";
				lletres = "";
			} else if (Character.isLetter(text.charAt(i)) || Character.isDigit(text.charAt(i))) {
				if (i == text.length() - 1) {
					lletresReves = lletresReves + lletres + text.charAt(i);
				}
				lletres = text.charAt(i) + lletres;
			} else {
				if (i == text.length() - 1) {
					lletresReves = lletresReves + lletres + text.charAt(i);
				}
				lletres = lletres + text.charAt(i);
			}
		}
		System.out.println(lletresReves);
	}
}
