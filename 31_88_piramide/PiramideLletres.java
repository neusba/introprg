/* Programa que demani un text i dibuixi un triangle amb les lletres del text en ordre invers al text introduït */

public class PiramideLletres {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		for (int i=0; i <= text.length() - 1; i++) {
			for (int j=0; j ) {
				System.out.print(".");
			}
			for (int j=0; j <= i; j++) {
				System.out.print(text.charAt(j));
			}
			System.out.println();
		}
	}
}
