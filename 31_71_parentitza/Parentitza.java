/* Programa que demana un text i mostra cada lletra entre paréntesis */

public class Parentitza {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		for (int posicio=0; posicio <= text.length() - 1; posicio++) {
			if (Character.isDigit(text.charAt(posicio)) || Character.isLetter(text.charAt(posicio))) {
				System.out.print("(" + text.charAt(posicio) + ")");
			} else if (Character.isWhitespace(text.charAt(posicio))) {
				System.out.print(" ");
			} else {
				System.out.print(text.charAt(posicio));
			}
			
		}
	}
}
