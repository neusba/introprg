/* Versió millorada del exercici 31_87, el qual a partir de l'entrada de l'usuari dibuixava un triangle amb les lletres del text però invertit */

public class TriangleLletresInvertit {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Text?");
		String text = Entrada.readLine();
		dibuixaTriangleInvertit(text);
	}
	// creem el mòdul que dibuixa el triangle
	public static void dibuixaTriangleInvertit(String text) {
		for (int lin=text.length() - 1; lin >= 0; lin--) {
			dibuixaLiniaInvertida(text, lin);
			System.out.println();
		}
	}
	// dibuixem les linies de cada triangle
	public static void dibuixaLiniaInvertida(String text, int linia) {
		for (int j=linia; j >= 0; j--) {
			if (j == 0) {
				System.out.print(text.charAt(j));
			} else {
				System.out.print(text.charAt(j) + ", ");
			}
		}
	}
}
