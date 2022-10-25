/* Programa que composa un mega triangle format per tres triangles */

public class Trilal {
	public static void main(String[] args) {
	
	// Creem el bucle per fer tot el triangle d'amunt
	for (int i = 9; i >= 0; i--) {
		for (int j = -10; j <= 9; j++) {
			if (j < i) {
				System.out.print(".");
			} else {
				System.out.print(j);
			}
		}
		for (int k = 8; k > -11; k--) {
			if (k >= i) {
				System.out.print(k);
			} else {
				System.out.print(".");
			}
		}
		System.out.println();
	}
	// Creem el bucle de la part de sota
	for (int l = 9; l >= 0; l--) {
		for (int m = 0; m < 9; m++) {
			if (m < l) {
				System.out.print(".");
			} else {
				System.out.print(m);
			}
		}
		for (int n = 9; n >= -1; n--) {
			if (n < l) {
				System.out.print(".");
			} else {
				System.out.print(n);
			}
		}
		for (int o = 0; o <= 9; o++) {
			if (o < l) {
				System.out.print(".");
			} else {
				System.out.print(o);
			}
		}
		for (int p = 8; p >= 0; p--) {
			if (p < l) {
				System.out.print(".");
			} else {
				System.out.print(p);
			}
		}

		System.out.println();
	}
	}
}


