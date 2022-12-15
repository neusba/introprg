/* Programa que demana les notes dels alumnes per entrada estàndard i quan rep un negatiu finalitza i mostra per pantalla la nota més alta
 * En aquest exercici utilitzarem només les eines conegudes fins ara
 */
public class NotaMesAlta {
	public static void main (String[] args) {
		System.out.println("Introdueix les notes (-1 per finalitzar)");
		int nota = Integer.parseInt(Entrada.readLine());
		int contador = 1;
		int notaMesAlta = nota;
		while (nota > 0) {
			if (nota >= notaMesAlta) {
				notaMesAlta = nota;
			}
			nota = Integer.parseInt(Entrada.readLine());
			contador += 1;
		}
		if (contador < 3) {
			System.out.println("Com a mínim calen dues notes");
		} else {
			System.out.printf("La nota més alta és %d", notaMesAlta);
		}
	}
}
