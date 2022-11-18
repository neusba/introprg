/* Programa que demana un text i el retorna formant un triangle amb cada paraula */

public class TriangleParaules {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String lletres = "";
		int contadorSpace = 0;

		for (int i=0; i < text.length(); i++) {
			contadorSpace += 1;
			if (!Character.isWhitespace(text.charAt(i))) {
				lletres = lletres + text.charAt(i);
			} else if (Character.isWhitespace(text.charAt(i))) {
				if (contadorSpace > 1) {
					System.out.printf("%s %n",
							lletres);
				} else {
					System.out.println(lletres);
				}
			}
		}
		System.out.println(lletres);

	}
}
