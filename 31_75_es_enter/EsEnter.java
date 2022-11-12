/* Programa que demana texts per entrada fins que rep un buit, quan no sigui buit ens dirà si és un nombre enter escrit amb dígits tot ignorant els espais extra a l'inici i al final del text i es pot acceptar el signe +/- */

public class EsEnter {
	public static void main(String[] args) {
		System.out.println("Introdueix texts (enter sol per finalitzar)");
		String text = Entrada.readLine();
		
		while (!text.isEmpty()) {
			String stripText = text.strip();
			
			int contadorLletres = 0; // Afegeix un cada vegada que un carácter és una lletra
			int contadorSignes = 0; // Afegeix un cada vegada que un caràcter és un número
			for (int i=0; i < stripText.length(); i++) {
				if (Character.isLetter(stripText.charAt(i))) {
					contadorLletres += 1;
				}
				if (!Character.isDigit(stripText.charAt(i)) && !Character.isLetter(stripText.charAt(i))) {
					contadorSignes += 1;
				}
			}
			if (contadorLletres >= 1) {
				System.out.println("No és enter");
			} else if (contadorLletres == 0) {
				System.out.println("És enter");
			} else if (contadorSignes > 2) {
				System.out.println("No és enter");
			} else if (contadorSignes <= 1) { 
				System.out.println("És enter");
			}
		text = Entrada.readLine();
		}
		System.out.println("Adéu");
	}
}
				

					
