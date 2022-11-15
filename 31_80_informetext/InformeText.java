/* Programa que demani un text i mostri un petit informe resumes de les estadístiques del text: quantitat de caràcters, lletres, vocals, dígits i altres caràcters */

public class InformeText {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		System.out.println("Informe");
		System.out.println("=======");
		String vocals = "aeiouàèéíïóòúü";
		String vocalsMajuscules = vocals.toUpperCase();

		int totalCaracters = 0; // done
		int lletresMajus = 0; // donde
		int lletresMinus = 0; // done
		int totalLletres = 0;
		int vocalsMajus = 0; // done
		int vocalsMinus = 0; // done
		int totalVocals = vocalsMajus + vocalsMinus;
		int totalDigits = 0;
		int totalAltres = 0;

		for (int i=0; i < text.length(); i++) {
			totalCaracters += 1;
			if (Character.isLetter(text.charAt(i))) {
				totalLletres += 1;
				if (Character.isUpperCase(text.charAt(i))) {
					lletresMajus += 1;
					for (int j=0; j < vocalsMajuscules.length(); j++) {
						if (text.charAt(i) == vocalsMajuscules.charAt(j)) {
							vocalsMajus += 1;
						}
					}
				} else if (Character.isLowerCase(text.charAt(i))) {
					lletresMinus += 1;
					for (int j=0; j < vocals.length(); j++) {
						if (text.charAt(i) == vocals.charAt(j)) {
							vocalsMinus += 1;
						}
					}
				}	
			} else if (Character.isDigit(text.charAt(i))) {
				totalDigits += 1;
			} else {
				totalAltres += 1;
			}
		}
		System.out.println(lletresMajus);
		System.out.println(lletresMinus);
		System.out.println(totalLletres);
		System.out.println(vocalsMajus);
		System.out.println(vocalsMinus);
		System.out.println(totalVocals);
		System.out.println(totalDigits);
		System.out.println(totalAltres);
		System.out.println(totalCaracters);
	}
}
					
											    

