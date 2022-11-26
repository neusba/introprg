/* Versió millorada del exercici Analitza Caràcter amb un codi diferent. */

public class AnalitzaCaracter {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Text?");
		String text = Entrada.readLine();
		System.out.println("Posició?");
		int posicio = Integer.parseInt(Entrada.readLine());
		// Comprovem que son vàlides i mostrem error necessaris
		if (posicio >= text.length()) {
			System.out.println("Fora de rang");
		} else {
			if (posicio < 0) {
				posicio = text.length() - Math.abs(posicio);
				if (posicio < 0) {
					System.out.println("Fora de rang");
					return;
				}
			}
			char ch = text.charAt(posicio);
			analitzaCaracter(ch);
		}
	}

	// Anàlisi del caràcter	
	public static void analitzaCaracter(char ch) {
		if (Character.isLetter(ch)) {
			System.out.printf("\'%c\' és una lletra", ch);
		} else if (Character.isDigit(ch)) {
			System.out.printf("\'%c\' és un nombre", ch);
		} else {
			System.out.printf("\'%c\' és una altra cosa", ch);
		}
	}
}	
