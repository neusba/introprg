/* Programa que vagi demanant text fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit. */

public class ConteDarrer {
	public static void main(String[] args) {
		System.out.println("Introdueix texts (enter sol per finalitzar)");
		String text = Entrada.readLine();
		int contadorText = 0;

		if (!text.isEmpty()) {
			text = text.toLowerCase();
		}	
		char darreraLletra = text.charAt(text.length() - 1);
		while (!text.isEmpty() || !text.isBlank()) {
			contadorText += 1;
			boolean conteLletra = false;
			for (int i=0; i < text.length(); i++) {
				if (text.charAt(i) == darreraLletra) {
					conteLletra = true;
				}
			}
			if (conteLletra) {
				System.out.println("bé");
			} else {
				break;
			}
			char darreraNovaLletra = text.charAt(text.length() - 1);	
			text = Entrada.readLine();
			text = text.toLowerCase();
			if (contadorText >= 2) {
				char auxiliar = darreraLletra;
				darreraLletra = darreraNovaLletra;
			}
		}
		System.out.println("Adéu");
	}
}				
