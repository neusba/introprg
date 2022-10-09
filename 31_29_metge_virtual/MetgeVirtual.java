/* Programa que simula un metge virtual que recepta certs medicaments segons els símptomes del pacient */

public class MetgeVirtual {
	public static void main(String[] args) {
		// Iniciem la interacció del metge virtual amb l'usuari
		System.out.println("Hola! Benvingut al metge virtual. Quin és el teu nom?");
		String nomPacient = Entrada.readLine();

		System.out.println("Perfecte, " + nomPacient + ". " + "Per començar, descriu-me els teus símptomes.");
		String simptomes = Entrada.readLine();

		// Segons els símptomes donats per l'usuari, el metge receptarà una medicació o una altra
		if (simptomes.equals("esternuts i mal de cap")) {
			System.out.println("Pateixes d'algún problema d'estómac?");
			String problemaEstomac = Entrada.readLine();
			if (problemaEstomac.equals("Sí")) {
				System.out.println("D'acord, en aquesta ocasió et recomanaré prendre paracetamol.");
			} else {
				System.out.println("D'acord, llavors hauràs de prendre àcid acetil salicílic, t'enviaré la recepta.");
			}
		} else if (simptomes.equals("tos")) {
			System.out.println("Quina és la teva edat?");
			int edatPacient = Integer.parseInt(Entrada.readLine());
			if (edatPacient < 12) {
				System.out.println("Al ser menor de 12 anys et puc recomanar un carmel de mel.");
			} else {
				System.out.println("Per la teva edat et recomanaré un carmel d'eucaliptus.");
			}
		} else {
			System.out.println("El millor serà que vinguis a la consulta per poder-te examinar. T'aniré agafant cita...");
		}

		System.out.println("Fins aviat, " + nomPacient);
	}
}
