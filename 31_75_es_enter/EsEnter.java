/* Programa que demana texts per entrada fins que rep un buit, quan no sigui buit ens dirà si és un nombre enter escrit amb dígits tot ignorant els espais extra a l'inici i al final del text i es pot acceptar el signe +/- */

public class EsEnter {
	public static void main(String[] args) {
		System.out.println("Introdueix texts (enter sol per finalitzar)");
		String text = Entrada.readLine();

		while (!text.isEmpty() || !text.isBlank()) {
			String stripText = text.strip();
			
			if (Character.isLetter(stripText.charAt(0))) {
				System.out.println("No és enter");
			} else if (stripText.startsWith("+") || stripText.endsWith("-") || stripText.startsWith("-") || stripText.endsWith("+")) {
				String stripDigitText = " ";
				for (int i=0; i < stripText.length(); i ++) {
					if (Character.isDigit(stripText.charAt(i))) {
						stripDigitText = stripDigitText + stripDigitText.charAt(i);
					}
				}
				int intStripDigitText = Integer.parseInt(stripDigitText);
				if (intStripDigitText >= 0 || intStripDigitText < 0) {
					System.out.println("És enter");
				}
			} else {
				System.out.println("És enter");
			}
			text = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}

					
