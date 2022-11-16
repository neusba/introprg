/* Programa que demana una text i dibuixi un triangle amb les lletres del text en ordre invers al text introduït */

public class TriangleLletresInvertit {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();

		for (int i=text.length() - 1; i >= 0; i--) {
			for (int j=i; j >= 0; j--) {
				if (j == 0) {
					System.out.print(text.charAt(j));
				} else {
					System.out.print(text.charAt(j) + ", ");
				}
			}
			System.out.println();
		}
	}
}
