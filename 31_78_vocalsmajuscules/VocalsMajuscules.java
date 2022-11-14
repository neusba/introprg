/* Programa que demani un text i mostri les lletres en minúscules menys les vocals que han d'estar en majúscula */

public class VocalsMajuscules {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		text = text.toLowerCase();
		String vocals = "aeiou";
		char letra = text.charAt(0);
		String nouText = " ";

		for (int i=0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				for (int j=0; j < vocals.length(); j++) {
					letra = text.charAt(i);
					if (text.charAt(i) == vocals.charAt(j)) {
						letra = Character.toUpperCase(text.charAt(i));
						break;
					}
				}
			}
			nouText = nouText + letra;
		}
		System.out.println(nouText);
		}
	}
			
