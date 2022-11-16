/* Programa que demana un text i dibuixi un triangle amb les lletres del text */

public class TriangleLletres {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();

		for (int i=0; i < text.length(); i++) {
			for (int j=0; j <= i; j++) {
				if (j == i) {
					System.out.print(text.charAt(j));
				} else {
					System.out.print(text.charAt(j) + ", ");
				}
			}
			System.out.println();
		}
	}
}

