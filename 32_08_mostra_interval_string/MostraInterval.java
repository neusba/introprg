/* Versió millorada del exercici MostraInterval, en aquest cas, void main s'encarregarà d'obtenir les dades i cridarà un nou mòdul que serà el que mostri l'interval */

public class MostraInterval {
	public static void main(String[] args) {
		// obtenim les dades
		System.out.println("text?");
		String text = Entrada.readLine();
		System.out.println("inici?");
		int inici = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int fi = Integer.parseInt(Entrada.readLine());
		// cridem al següent mòdul
		mostraInterval(text, inici, fi);
	}
	// mòdul encarregat de mostrar l'interval
	public static void mostraInterval(String text, int inici, int fi) {
		// valor inicial és menor que 0
		if (inici < 0) {
			inici = 0;
			if (fi < 0) {
				fi = 0;
				mostraCaracters(text, inici, fi);
			} else if (fi >= text.length()) {
				fi = text.length() - 1;
				mostraCaracters(text, inici, fi);
			} else {
				mostraCaracters(text, inici, fi);
			}	
		// valor inicial és major que la longitud del text
		} else if (inici >= text.length()) {
			inici = text.length() - 1;
			if (fi < 0) {
				fi = 0;
				mostraCaracters(text, inici, fi);
			} else if (fi >= text.length()) {
				fi = text.length() - 1;
				mostraCaracters(text, inici,fi);
			} else {
				mostraCaracters(text, inici, fi);
			}
		} else {
			if (fi < 0) {
				fi = 0;
				mostraCaracters(text, inici, fi);
			} else if (fi >= text.length()) {
				fi = text.length() - 1;
				mostraCaracters(text, inici, fi);
			} else {
				mostraCaracters(text, inici, fi);
			}
		}
	}
	// mòdul mostra caràcters
	public static void mostraCaracters(String text, int inici, int fi) {
		if (inici > fi) {
			for (int i=inici; i >= fi; i--) {
				System.out.println(text.charAt(i));
			}
		} else {
			for (int i=inici; i <= fi; i++) {
				System.out.println(text.charAt(i));
			}
		}
	}
}
