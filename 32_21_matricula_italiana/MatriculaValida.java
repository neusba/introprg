/* Versió millorada del exercici 31_68, el qual constava de rebre un text i revisar si els caràcters d'aquest cumplien amb les normes per ser una màtricula italiana vàlida o no */

public class MatriculaValida {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Introduïu una matrícula");
		String text = Entrada.readLine();
		text = text.toUpperCase();
		if (text.length() != 7) {
			System.out.println("No és una matrícula italiana vàlida");
			return;
		}
		for (int i=0; i < text.length(); i++) {
			char lletra = text.charAt(i);
			if (i < 2 || i > 4) {
				boolean valida = esLletraValidaPerMatriculaItaliana(lletra);
				if (!valida) {
					System.out.println("No és una matrícula italiana vàlida");
					return;
				} else {
					if (i == text.length() - 1) {
						System.out.println("És una matrícula italiana vàlida");
					}
				}
			} else {
				if (!Character.isDigit(lletra)) {
					System.out.println("No és una matrícula italiana vàlida");
					return;
				}
			}
		}
	}
	// revisio de les lletres de la matricula
	public static boolean esLletraValidaPerMatriculaItaliana(char lletra) {
		String noValides = "ÇAÑIOQU";
		for (int i=0; i < noValides.length(); i++) {
			if (lletra == noValides.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
