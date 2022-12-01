/* Versió millorada del exercici 31_68, el qual constava de rebre un text i revisar si els caràcters d'aquest cumplien amb les normes per ser una màtricula italiana vàlida o no */

public class MatriculaValida {
	public static void main(String[] args) {
		// obtenime les dades
		System.out.println("Introdueix matrícula");
		String text = Entrada.readLine();
		text = text.toUpperCase();
		for (int i=0; i < text.length(); i++) {
			char lletra = text.charAt(i);
			boolean valida = esLletraValidaPerMatriculaItaliana(lletra);
			mostraResposta(valida, lletra, text);
		}
	}
	// resposta al text donat
	public static void mostraResposta(boolean valida, char lletra, String text) {
		boolean matriculaValida;
		if (!valida) {
			System.out.println("No és una matrícula italiana vàlida");
		} else if (valida && lletra == text.length() - 1) {
			System.out.println("És una matrícula italiana vàlida");
		}	
	}
	// Revisió lletres matrícula
	public static boolean esLletraValidaPerMatriculaItaliana(char lletra) {
		String noValides = "ÇÀÑIOQU";
		if (lletra > 1 && lletra < 5) {
		       if (!Character.isDigit(lletra)) {
			       return false;
		       }
		} else {	       
			for (int i=0; i < noValides.length(); i++) {
				if (lletra == noValides.charAt(i)) {
					return false;
			       	}
			}
		}
		return true;
	}
}



