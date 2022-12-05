/* Versió millorada del exercici del lloro quje repeteix quan la primera lletra o la última és vocal catalana.
 * Aquesta vegada utilitzarem tres mòduls
 */

public class VocalLloroIniciFi {
	public static void main(String[] args) {
		boolean confirmacio = false;
		String paraula;
		String resposta;
		while (!confirmacio) {
			System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
			paraula = Entrada.readLine();
			if (paraula.isEmpty()) {
				System.out.println("El lloro demana confirmació per finalitzar");
				resposta = Entrada.readLine();
				confirmacio = UtilitatsConfirmacio.respostaABoolean(resposta);
			} else {
				for (int i=0; i < paraula.length(); i++) {
					char lletra = paraula.charAt(i);
					if (i == 0 || i == paraula.length() - 1) {
						boolean vocal = UtilString.esVocal(lletra);
						if (vocal) {
							System.out.printf("El lloro diu: %s%n", paraula);
							break;
						}
					}
				}
			}
		}
		System.out.println("Adéu");
	}
}


