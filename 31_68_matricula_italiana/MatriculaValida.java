/* Programa que demana una matrícula a un usuari i li diu si es una matrícula italiana vigent */

public class MatriculaValida {
	public static void main(String[] args) {

		System.out.println("Introduïu una matrícula");
		String matricula = Entrada.readLine();
		
		
		if (matricula.length() != 7) {
			System.out.println("No és una matrícula italiana vàlida");
		} else {
			char zero = matricula.charAt(0);
			char primer = matricula.charAt(1);
			char segon = matricula.charAt(2);
			char tercer = matricula.charAt(3);
			char quart = matricula.charAt(4);
			char cinque = matricula.charAt(5);
			char sise = matricula.charAt(6);

			if (!Character.isLetter(zero) || !Character.isLetter(primer) || !Character.isUpperCase(zero) || !Character.isUpperCase(primer)) {
				System.out.println("No és una matrícula italiana vàlida");
			} else {
				String stringZero = Character.toString(zero);
				String stringPrimer = Character.toString(primer);
				if (stringZero.equals("Ç") || stringZero.equals("À") || stringZero.equals("Ñ") || stringZero.equals("ß") || stringZero.equals("I") || stringZero.equals("O") || stringZero.equals("Q") || stringZero.equals("U") || stringPrimer.equals("Ç") || stringPrimer.equals("À") || stringPrimer.equals("Ñ") || stringPrimer.equals("ß") || stringPrimer.equals("I") || stringPrimer.equals("O") || stringPrimer.equals("Q") || stringPrimer.equals("U")) { // Hacer lo mismo pero con stringPrimer
					System.out.println("No és una matrícula italiana vàlida");	
				} else {
					if (!Character.isDigit(segon) || !Character.isDigit(tercer) || !Character.isDigit(quart)) {
						System.out.println("No és una matrícula italiana vàlida");
					} else {
						if (!Character.isLetter(cinque) || !Character.isLetter(sise) || !Character.isUpperCase(cinque) || !Character.isUpperCase(sise)) {
							System.out.println("No és una matrícula italiana vàlida");
						} else {
							String stringCinque = Character.toString(cinque);
							String stringSise = Character.toString(sise);
							if (stringCinque.equals("Ç") || stringCinque.equals("À") || stringCinque.equals("Ñ") || stringCinque.equals("ß") || stringCinque.equals("I") || stringCinque.equals("O") || stringCinque.equals("Q") || stringCinque.equals("U") || stringSise.equals("Ç") || stringSise.equals("À") || stringSise.equals("Ñ") || stringSise.equals("ß") || stringSise.equals("I") || stringSise.equals("O") || stringSise.equals("Q") || stringSise.equals("U")) {
								System.out.println("No és una matrícula italiana vàlida");
							} else {
								System.out.println("És una matrícula italiana vàlida");
							}	
						}
					}
				}
			}
		}
	}
}
