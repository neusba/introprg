/* Funcions per l'exercici 32_32
 * La primera converteix un int a un String i agrupa totes les notes introduïdes en una llista
 * La segona filtra les notes i exclou la més alta de la llista
 * La tercera funció exclou de la llista un dels dos nombres o més que estiguin repetits
 * La quarta funció ordena la llista de manera descendent
 * L'última funció s'encarrega d'afegir les comes i connectors necessaris per mostrar el String ginal
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
		for (int i=0; i < llistaFiltrada.length(); i++) {
			boolean conteCaracter = false;
			if (i == llistaFiltrada.length() - 1) {
				llistaNoRepetits = llistaNoRepetits + llistaFiltrada.charAt(i);
			} else {
				for (int j=i+1; j < llistaFiltrada.length(); j++) {
					if (llistaFiltrada.charAt(i) == llistaFiltrada.charAt(j)) {
						conteCaracter = true;
					}
				}
				if (!conteCaracter) {
					llistaNoRepetits = llistaNoRepetits + llistaFiltrada.charAt(i);
				}
			}
		}
		return llistaNoRepetits;
	}

	//Funció que agafarà la llista final i ordenarà els nombres de manera descendent
	public static String llistaDescendent(String llistaNoRepetits) {
		String llistaFiltradaDescendent = "";
		for (int i=10; i >= 1; i--) {
			for (int j=0; j < llistaNoRepetits.length(); j++) {
				String auxNum = Integer.toString(i);
				String auxCh = Character.toString(llistaNoRepetits.charAt(j));
				if (auxNum.equals(auxCh)) {
					llistaFiltradaDescendent = llistaFiltradaDescendent + auxCh;
				}
			}
		}
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
		return llistaFiltradaOrdenada;
	}
}

