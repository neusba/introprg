/* Programa que demana un text i indica si és o no capicua */

public class Capicua {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String textReves = "";

		for (int i=text.length() - 1; i >= 0; i--) {
			textReves = textReves + text.charAt(i);
		}
		if (text.equalsIgnoreCase(textReves)) {
			System.out.println("És capicua");
		} else {
			System.out.println("No és capicua");
		}
	}
}

