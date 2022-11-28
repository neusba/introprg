/* Versió millorada del exercici 31_71, el qual demana un text i mostra cada paraula entre parèntesis */

public class Parentitza {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Text?");
		String text = Entrada.readLine();
		parentitza(text);
	}
	// posem els parèntesis
	public static void parentitza(String text) {
		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				System.out.printf("(%c)", text.charAt(i));
			} else {
				System.out.print(text.charAt(i));
			}
		}
	}
}
