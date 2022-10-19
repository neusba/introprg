/* Programa que demana a l'usuari el seu nom, edat i l'any actual i mostra per pantalla quants anys tenia cada any desde que va nèixer */

public class HistoricEdats {
	public static void main(String[] args) {
		// Declarem variables
		System.out.println("El vostre nom?");
		String nom = Entrada.readLine();
		System.out.println("La vostra edat?");
		int edat = Integer.parseInt(Entrada.readLine());
		System.out.println("L'any actual?");
		int anyActual = Integer.parseInt(Entrada.readLine());

		int edatRecorregut = 2;
                int anyNaixement = anyActual - edat;

		if (nom.isEmpty() || edat < 0 || anyActual < 1971) {
			System.out.println("Entrada errònia");
		} else if (edat == 0) {
			System.out.println("Adéu " + nom);
                } else if (edat == 1) {
                        System.out.println("El " + anyNaixement + " vau néixer");
                        System.out.println("Adéu " + nom);
                } else if (edat > 1) {
                        System.out.println("El " + anyNaixement + " vau néixer");
                        System.out.println("El " + (anyNaixement + 1) + " teníeu 1 any");

                        for (int i = anyNaixement + 2; i < anyActual; i++, edatRecorregut++) {
                        	System.out.println("El " + i + " teníeu " + edatRecorregut + " anys");
                        }
                        
			System.out.println("Adéu " + nom);

		}
	}
}

	
