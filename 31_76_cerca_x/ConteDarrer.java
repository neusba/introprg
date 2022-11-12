/* Programa que vagi demanant text fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit. */

public class ConteDarrer {
	public static void main(String[] args) {
		System.out.println("Introdueix texts (enter sol per finalitzar)");
		String text = Entrada.readLine();
		
		int contadorText = 0;	
		while (!text.isEmpty()) {
			contadorText += 1;
			if (contadorText == 1) {
				System.out.println("bé");
			} else {
				char darreraLletra = text.charAt(text.length() - 1);
				for (int i=0; i < text.length(); i++) {
					if (text.charAt(i) == darreraLletra) {
						System.out.println("bé");
						text = Entrada.readLine();
					} else {
						break;
					}
				break;
				}
			break;
			}
		break;
		}
		System.out.println("Adéu");
	}
}
		
