/* Programa que demana un text i el mostra codificat segons certes instruccions */

public class CodificaBasic {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		String textCodificat = "";

		for (int i=0; i <= text.length() - 1; i++) {
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				if (text.charAt(i) == 'z') {
					System.out.print('a');
				} else {
					System.out.print((char)(text.charAt(i) + 1));
				}
			} else {
				System.out.print(text.charAt(i));
			}
		}
	}
}

