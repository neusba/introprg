/* Programa que demani un text i mostri les lletres en minúscules menys les vocals que han d'estar en majúscula */

public class VocalsMajuscules {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		text = text.toLowerCase();
		String vocals = "aeiou";

		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				for (int j=0; j < vocals.length(); j++) {
					if (text.charAt(i) == vocals.charAt(j)) {
						Character.toUpperCase(text.charAt(i));
					}
				}
			}
		}
		System.out.println(text);

	}
}




