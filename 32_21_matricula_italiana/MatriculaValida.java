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
			valoraMatricula(text, caracter, valida, matricula);
		}
		mostraResposta(matricula);
	}
	// revisio de les lletres de la matricula
	public static boolean esLletraValidaPerMatriculaItaliana(int posicio, char caracter, String matricula) {
		String noValides = "ÇAÑIOQU";
		if (posicio > 1 && posicio < 5) {
			if (!Character.isDigit(caracter)) {
				return false;
			}
		}
		for (int i=0; i < noValides.length(); i++) {
			if (caracter == noValides.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	// valora la matricula
	public static void valoraMatricula(String text, char caracter, boolean valida, String matricula) {
		if (valida) {
			matricula = matricula + caracter;
		}	
	}
	// mostrem la resposta
	public static void mostraResposta(String matricula) {
		if (matricula.length() != 7) {
			System.out.println("No és una matrícula italiana vàlida");
		} else {
			System.out.println("És una matrícula italiana vàlida");
		}
	}
}
