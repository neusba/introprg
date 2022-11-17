/* Programa que demana un text i retorna el text amb la primera lletra de cada PARAULA en majúscula i les altres en minúscules */

public class MajusculitzaInicials {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String nouText = "";
		boolean primeraLletra = false;

		if (text.isEmpty()) {
			System.out.println("Cadena buida");
		} else {
			text = text.toLowerCase();
			for (int i=0; i < text.length(); i++) {
				if (Character.isLetter(text.charAt(i))) {
					if (!primeraLletra) {
						nouText = nouText + Character.toUpperCase(text.charAt(i));
						primeraLletra = true;
					} else if (Character.isWhitespace(text.charAt(i - 1)) || (!Character.isLetter(text.charAt(i - 1)) && !Character.isDigit(text.charAt(i - 1)))) {
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
}

			
