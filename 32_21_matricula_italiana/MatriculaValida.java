/* Versió millorada del exercici 31_68, el qual constava de rebre un text i revisar si els caràcters d'aquest cumplien amb les normes per ser una màtricula italiana vàlida o no */

public class MatriculaValida {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Introduïu una matrícula");
		String text = Entrada.readLine();
		String noValida = "No és una matrícula italiana vàlida";
		if (text.length() != 7) {
			System.out.println(noValida);
			return;
		}
		for (int i=0; i < text.length(); i++) {
			char lletra = text.charAt(i);
			if (i > 1 && i < 5) {
				if (!Character.isDigit(lletra)) {
					System.out.println(noValida);
					return;
				}
			} else {
				boolean valida = esLletraValidaPerMatriculaItaliana(lletra);
				if (!valida) {
					System.out.println(noValida);
					return;
				}
			}
		}
		System.out.println("És una matrícula italiana vàlida");
	}
	// revisio de les lletres de la matricula
	public static boolean esLletraValidaPerMatriculaItaliana(char lletra) {
		String noValides = "IOQU";
		if (Character.isLetter(lletra) && Character.isUpperCase(lletra)) {
			if (lletra >= 'A' && lletra <= 'Z') {
				for (int i=0; i < noValides.length(); i++) {
					if (lletra == noValides.charAt(i)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;

	}
}
