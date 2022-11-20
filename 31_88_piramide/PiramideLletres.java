/* Programa que demani un text i dibuixi un triangle amb les lletres del text en ordre invers al text introduït */

public class PiramideLletres {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		for (int i=0; i < text.length(); i++) {
			// Izquierda
			for (int j=text.length() - 1; j >= 0; j--) {
				if (j <= i) {
					if (j == 0) {
						System.out.print(text.charAt(i-j));
					} else {
						System.out.print(text.charAt(i-j) + ".");
					}
				} else {
					System.out.print("..");
				}
			}
			System.out.print("-");
			// Derecha
			for (int j=0; j < text.length(); j++) {
				if (j <= i) {
					if (j == 0) {
						System.out.print(text.charAt(i-j));
					} else {
						System.out.print("." + text.charAt(i-j));
					}
				} else {
					System.out.print("..");
				}
			}
			System.out.println();
		}
	}
}

						
							
