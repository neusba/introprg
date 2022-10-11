/* Programa que demana valors a l'usuari i els va sumant fins que hi ha un negatiu */

public class SumaPositius {
	public static void main(String[] args) {
		
		// Declarem la variable on anirà la suma i la variable del valor que donarà l'usuari
		int valor;
		int suma = 0;

		// Demanem el primer valor a l'usuari
		System.out.println("Introdueix el primer valor");
		valor = Integer.parseInt(Entrada.readLine());
		if (valor >= 0) {
			suma = suma + valor;
			// Demanem el segon valor
			System.out.println("Introdueix el segon valor");
			valor = Integer.parseInt(Entrada.readLine());
			if (valor >= 0) {
				suma = suma + valor;
				// Demana el tercer valor
				System.out.println("Introdueix el tercer valor");
				valor = Integer.parseInt(Entrada.readLine());
				if (valor >= 0) {
					suma = suma + valor;
				}
			}
		} else {
			System.out.println(suma);
		}
		// Imprimim la suma total
		System.out.println("La suma es: " + suma);
	}
}

