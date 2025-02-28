/* Programa que demana un text i retorna una nova versió transformada amb les vocals catalanes en minúscules, les no vocals en majúscules, nombres entre parèntesis i sense la resta de caràcters (excepte el espais en blanc) */

public class TransformaText {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String vocals = "AEIOUÀÉÈÍÏÓÒÚÜ";
		String nouText = "";
		boolean conteVocal;

		text = text.toUpperCase();
		for (int i=0; i < text.length(); i++) {
			conteVocal = false;
			if (Character.isLetter(text.charAt(i))) {
				for (int j=0; j < vocals.length(); j ++) {
					if (text.charAt(i) == vocals.charAt(j)) {
						nouText = nouText + Character.toLowerCase(text.charAt(i));
						conteVocal = true;
					}
				}
				if (!conteVocal) {
					nouText = nouText + text.charAt(i);
				}
			} else if (Character.isDigit(text.charAt(i))) {
				if (text.charAt(i) == text.charAt(0)) {
					nouText = nouText + "(" + text.charAt(i);
				} else if (Character.isDigit(text.charAt(i - 1))) {
					if (text.charAt(i) == text.charAt(text.length() -1)) {
						nouText = nouText + text.charAt(i) + ")";
					} else {
						nouText = nouText + text.charAt(i);
					}
				} else if (Character.isWhitespace(text.charAt(i - 1))) {
					nouText = nouText + "(" + text.charAt(i);
				}
			} else if (Character.isWhitespace(text.charAt(i))) {
				if (Character.isDigit(text.charAt(i - 1))) {
					nouText = nouText + ") ";
				} else {
					nouText = nouText + text.charAt(i);
				}
			}
		}
		System.out.println(nouText);	
	}
}
