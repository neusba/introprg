/* Comprobación examen con while ej 3 */

public class examenwhile {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		int i = 0;

		while (i < text.length()) {
			if (Character.isLetter(text.charAt(i))) {
				System.out.printf("La posició %d de \"%s\" val \'%c\'",
						i,
						text,
						text.charAt(i));
			} // Falta salto de línea la concha de su madre
			i++;
		}
	}
}
