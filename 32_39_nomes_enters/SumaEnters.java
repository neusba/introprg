/* Programa que rep els arguments per la línia de comandes i suma els nombres que si són enters
 */
public class SumaEnters {
	public static void main(String[] args) {
		// mòdul que compta la quantitat (int) d'enters que hi ha a l'array
		int quants = quantsEnters(args);
		// modul que omple l'array creat amb la quantitat anterior de enters a l'array amb els nombres que són enters
		int[] enters = UtilString.filtraEnters(args, quants);
		// mòdul que suma els valors del array d'enters
		int suma = UtilString.sumaEnters(enters);
		System.out.println(suma);
	}

	// funcio que compta enters
	public static int quantsEnters(String[] valors) {
		int quants = 0;
		for (int i=0; i<valors.length; i++) {
			boolean esEnter = UtilString. esEnter(valors[i]);
			if (esEnter) {
				quants += 1;
			}
		}
		return quants;
	}
}
		
