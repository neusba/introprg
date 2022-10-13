/* Programa que demani un número enter positiu i es declari como àncora. Despŕes es van demanant nombres positius fins que es reb un negatiu, finalment es mostrarà el nombre més proper a l'àncora. */

public class TrobaMesProxim {
	public static void main(String[] args) {

		// Declarem les variables corresponents
		int ancora;
		int valor = 0; // Inicialitzem en cero per estalviar repetir codi
		int valorMesProxim = 0; // El primer valor més pròxim és igual al primer valor llegit
		int diferencia; // Diferencia entre el valor i l'àncora
		int diferenciaValorMesProxim = ancora; // Inicialitzem la diferencia igual a l'ancora perque el primer valor llegit serà 0 i és la diferència entre les dos.

		// Demanem l'ancora a l'usuari
		System.out.println("Introdueix l'àncora");
		ancora = Integer.parseInt(Entrada.readLine());
		if (ancora <= 0) {
			System.out.println("Àncora no vàlida");
		}

		// Creem el bucle while
		while (valor >= 0) {
			// Calculem la diferencia que hi ha entre el valor i l'ancora
			if (valor > ancora) {
				diferencia = valor - ancora;
			} else if (valor < ancora) {
				diferencia = ancora - valor;
			}
			// Comparem les diferències del nou valor i la del actual valor més pròxim
			if (diferencia < diferenciaValorMesProxim) {
				valorMesProxim = valor; // Si el nou valor tè una diferència més petita que l'anterior, substituim el valor més pròxim actual
			} else if (diferencia == diferenciaValorMesProxim) {
				if (valor < valorMesProxim) {
					valorMesProxim = valor; // Si les diferències són igual, el quedarà el valor més petit
				}
			}
		}
		System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorMesProxim);
	}
}
