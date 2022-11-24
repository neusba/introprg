/* Comprobación examen ej 2 */

public class examen {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();

		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				System.out.printf("La posició %d de \"%s\" val \'%c\'",
						i,
						text,
						text.charAt(i));
			System.out.println();
			} // Diria que el printf ja inclou salt de linia
		}
	}
}
