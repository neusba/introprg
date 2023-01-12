/* Funcions per arrays i matrius de l'exercici 32_45 */

public class UtilTaula {
	public static char[][] substitueix(char[][] origen, char inici, char fi) {
		char[][] desti = new char[origen.length][origen[0].length];
		for (int i=0; i<origen.length; i++) {
			int cols = origen[i].length;
			for (int j=0; j<cols; j++) {
				if (origen[i][j] == inici) {
					desti[i][j] = fi;
				} else {
					desti[i][j] = origen[i][j];
				}
			}
		}
		return desti;
	}
}
