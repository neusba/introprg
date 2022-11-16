/* Programa que demana un text i el retorna invertit i separant els caràcters (inclosos espais) per comes */

public class TextReves {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		boolean primeraLletra = false;

		for (int i=text.length() - 1; i >= 0; i--) {
			if (!primeraLletra) {
				System.out.print(text.charAt(i));
				primeraLletra = true;
			} else { 
				System.out.print(", " + text.charAt(i));
			}
		}
	}
}
				
