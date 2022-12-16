/* Funcions per l'exercici 32_32
 * La primera converteix un int a un String
 * La segona filtra les notes i exclou la més alta de la llista
 * La tercera funció ordena els nombres en ordre descendent.
 * La quarta funció els afegeix les comes i connector necessaris per formar la frase coherent.
 */
public class UtilString {
	// Funció que converteix un int a enter
	public static String toString(int nota, String llistaNotes) {
		String notaString = Integer.toString(nota);
		llistaNotes = llistaNotes + notaString + ",";
		return llistaNotes;
	}
	// Funció que filtra les notes per excluir la més alta de la llista anterior
	public static String filtraNotes(String llistaNotes, int notaMesAlta) {
		String llistaFiltrada = "";
		String notaAlta = Integer.toString(notaMesAlta);
		String temp = "";
		for (int i=0; i < llistaNotes.length(); i++) {
			if (!Character.isDigit(llistaNotes.charAt(i))) {
				if (!temp.equals(notaAlta)) {
					llistaFiltrada = llistaFiltrada + temp;
				}
				temp = "";
				continue;
			} else {
				temp = temp + llistaNotes.charAt(i);
			}
		}
		return llistaFiltrada;
	}
	//Funció que exclou els nombre repetits la llista de notes filtrada
	public static String noRepetits(String llistaFiltrada) {
		String llistaNoRepetits = "";
		boolean conteCaracter = false;
		for (int i=0; i < llistaFiltrada.length(); i++) {
			if (i == llistaFiltrada.length() - 1) {
				llistaNoRepetits = llistaNoRepetits + llistaFiltrada.charAt(i);
			} else {
				for (int j=i+1; j < llistaFiltrada.length(); j++) {
					if (llistaFiltrada.charAt(i) == llistaFiltrada.charAt(j)) {
						conteCaracter = true;
					}
					if (!conteCaracter) {
						llistaNoRepetits = llistaNoRepetits + llistaFiltrada.charAt(i);
					}
				}
			}
		}
		System.out.println(llistaNoRepetits);
		return llistaNoRepetits;
	}

	//Funció que agafarà la llista final i ordenarà els nombres de manera descendent
	public static String llistaDescendent(String llistaNoRepetits) {
		String llistaFiltradaDescendent = "";
		for (int i=10; i >= 1; i--) {
			for (int j=0; j < llistaNoRepetits.length(); j++) {
				if (i == llistaNoRepetits.charAt(j)) {
					llistaFiltradaDescendent = llistaFiltradaDescendent + llistaNoRepetits.charAt(j);
				}
			}
		}
		System.out.println(llistaFiltradaDescendent);
		return llistaFiltradaDescendent;
	}	
	// Funció que ordena la llista final amb les notes que no són la més alta
	public static String ordenaNotes(String llistaFiltradaDescendent) {
		String llistaFiltradaOrdenada = "";
		for (int i=0; i < llistaFiltradaDescendent.length(); i++) {
			if (i == llistaFiltradaDescendent.length() - 2) {
				llistaFiltradaOrdenada = llistaFiltradaOrdenada + llistaFiltradaDescendent.charAt(i) + " i ";
			} else if (i == llistaFiltradaDescendent.length() - 1) {
				llistaFiltradaOrdenada = llistaFiltradaOrdenada + llistaFiltradaDescendent.charAt(i);
			} else {
				llistaFiltradaOrdenada = llistaFiltradaOrdenada + llistaFiltradaDescendent.charAt(i) + ", ";
			}
		}
		System.out.println(llistaFiltradaOrdenada);
		return llistaFiltradaOrdenada;
	}
}

