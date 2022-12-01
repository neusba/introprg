/* Versió millorada del exercici 31_68, el qual constava de rebre un text i revisar si els caràcters d'aquest cumplien amb les normes per ser una màtricula italiana vàlida o no */

public class MatriculaValida {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("Introduïu una matrícula");
		String text = Entrada.readLine();
		text = text.toUpperCase();
		String matricula = "";
		if (text.length() != 7) {
			System.out.println("No és una matrícula italiana vàlida");
			return;
		}
		for (int i=0; i < text.length(); i++) {
			int posicio = i;
			char caracter = text.charAt(i);
			boolean valida = esLletraValidaPerMatriculaItaliana(posicio, caracter, matricula);
			if (!valida) {
				return;
			}
			mostraResposta(text, posicio, valida);
		}
	}
	// revisio de les lletres de la matricula
	public static boolean esLletraValidaPerMatriculaItaliana(int posicio, char lletra, String matricula) {
		String noValides = "ÇAÑIOQU";
		if (posicio > 1 && posicio < 5) {
			if (!Character.isDigit(lletra)) {
				return false;
			}
		}
		for (int i=0; i < noValides.length(); i++) {
			if (lletra == noValides.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	// mostra resposta
	public static void mostraResposta(String text, int posicio, boolean valida) {
		if (!valida) {
			System.out.println("No és una matrícula italiana vàlida");
			return;
		} else if (posicio == text.length() - 1) {
			System.out.println("És una matrícula italiana vàlida");
		}
	}
}




