/* Programa que demana un text i compta totes les vocals que té. Considera també les vocals en català (accentuades i dièresis) */

public class ComptaVocals {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		text = text.toLowerCase();

		int contador = 0;
		String vocals = "aeiouàèéíïòóúü";

		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				for (int j=0; j < vocals.length(); j++) {
					if (text.charAt(i) == vocals.charAt(j)) {
						contador += 1;
					}
				}
			}
		}
		System.out.println(contador);
	}
}

