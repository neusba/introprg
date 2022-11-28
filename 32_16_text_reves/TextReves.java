/* Versió millorada del exercici 31_83, el qual consistia en demanar un text a l'usuari i invertir els seus caràcters */

public class TextReves {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Text?");
		String text = Entrada.readLine();
		mostraReves(text);
	}
	// invertim els caràcters i mostrem el text
	public static void mostraReves(String text) {
		boolean primeraLletra = false;
		for (int i= text.length() - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(text.charAt(i));
			} else {
				System.out.print(text.charAt(i) + ", ");
			}
		}
	}
}

