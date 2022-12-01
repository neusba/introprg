/* Versió millorada del exercici 31_68, el qual constava de rebre un text i revisar si els caràcters d'aquest cumplien amb les normes per ser una màtricula italiana vàlida o no */

public class MatriculaValida {
	public static void main(String[] args) {
		// obtenime les dades
		System.out.println("Introduïu una matrícula");
		String text = Entrada.readLine();
		text = text.toUpperCase();
		String matricula = ""; // matricula final a valorar
		for (int i=0; i < text.length(); i++) {
			char lletra = text.charAt(i);
			boolean valida = esLletraValidaPerMatriculaItaliana(lletra);
			valoraMatricula(valida, lletra, matricula);
		}
		mostraResposta(matricula);
	}
	// Revisió lletres matrícula
	public static boolean esLletraValidaPerMatriculaItaliana(char lletra) {
		String noValides = "ÇÀÑIOQU";
		for (int i=0; i < noValides.length(); i++) {
			if (lletra == noValides.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	// valora la matricula
	public static void valoraMatricula(boolean valida, char lletra, String matricula) {
		if (!valida) {
			System.out.println("No és una matrícula italiana vàlida");
				return;
		} else {
			matricula = matricula + lletra;
		}
	}
	// mostra la resposta
	public static void mostraResposta(String matricula) {
		if (matricula.length() != 6) {
			System.out.println("No és una matrícula italiana vàlida");
		} else {
			System.out.println("És una matrícula italiana vàlida");
		}
	}
}



