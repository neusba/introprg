/* Programa que demana una matriculada i valora si és vàlida o no donant una resposta a cada error */

public class MatriculaValida {
	public static void main(String[] args) {
		System.out.println("Introdueix una matrícula");
		String matricula = Entrada.readLine();
		String noValides = "ÇÀÑIOQU";
		boolean conteNoValida = false;

		if (matricula.length() > 7) {
			System.out.println("No és una matrícula italiana vàlida: massa llarga");
			return;
		} else if (matricula.length() < 7 ) {
			System.out.println("No és una matrícula italiana vàlida: massa curta");
			return;
		} else {
			for (int i=0; i < matricula.length(); i++) {
				if (i > 1 && i < 5) {
					if (!Character.isDigit(matricula.charAt(i))) {
						System.out.println(matricula.charAt(i) + ": Ha de ser un dígit");
					} else {
						System.out.println(matricula.charAt(i) + ": Correcte");
					}
				} else {
					if (!Character.isLetter(matricula.charAt(i))) {
						System.out.println(matricula.charAt(i) + ": Ha de ser una lletra");
					} else {
						if (Character.isLowerCase(matricula.charAt(i))) {
							System.out.println(matricula.charAt(i) + ": Ha de ser majúscula");
						} else {
							for (int j=0; j < noValides.length(); j++) {
								if (matricula.charAt(i) == noValides.charAt(j)) {
									System.out.println(matricula.charAt(i) + ": No és una lletra vàlida");
									conteNoValida = true;
								}
							}
							if (!conteNoValida) {
								System.out.println(matricula.charAt(i) + ": Correcte");
							}
						}
					}
				}
			}
		}
	}
}





				
// Para evitar repetir el mismo código para cada letra:
// Escribir una condicion que que sea para la posició > 1 y la posición < 5.
// Si el matricula.charAt(i) está entre estos números habrá unas condiciones, sinó se escribiran otras condiciones
//
