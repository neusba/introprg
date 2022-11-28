/* Versió millorada del exercici 31_86, el qual dibuixava un triangle de lletres amb comes a base d'una paraul introduïda per l'usuari */

public class TriangleLletres {
	public static void main(String[] args) {
		// obtenim les dades en aquest primer mòdul
		System.out.println("Text?");
		String text = Entrada.readLine();
		dibuixaTriangle(text);
	}
	// mostrem el triangle
	public static void dibuixaTriangle(String text) {
		for (int linia=0; linia < text.length(); linia++) {
			dibuixaLinia(text, linia);
			System.out.println();
		}
	}
	// dibuixem cada linia del triangle
	public static void dibuixaLinia(String text, int linia) {
		for (int j=0; j <= linia; j++) {
			if (j == linia) {
				System.out.print(text.charAt(j));
			} else {
				System.out.print(text.charAt(j) + ", ");
			}
		}
	}
}
