/* Programa que demana a l'usuari endevinar un nombre entre 1 i 100, (42). Donarà X respostes segons el número introduït i cancel·larà quan es doni una cadena buida. S'ha de comprobar que les entrades són realment valors enter i s'han d'utliltzar els nous mecanismes de control de bucles */

public class Endevina {
	public static void main(String[] args) {
		System.out.println("Nombre?");
		String nombre = Entrada.readLine();

		while (!nombre.isEmpty()) {
			boolean conteLletres = false;
			for (int i=0; i < nombre.length(); i++) {
				if (Character.isLetter(nombre.charAt(i))) {
					conteLletres = true;
				}
			}
			if (conteLletres) {
				System.out.println("Només nombres");
			} else {
				int nombreDigit = Integer.parseInt(nombre);
				if (nombreDigit < 1 || nombreDigit > 100) {
					System.out.println("Fora de rang");
				} else if (nombreDigit > 42) {
					System.out.println("Massa gran");
				} else if (nombreDigit < 42) {
					System.out.println("Massa petit");
				} else {
					System.out.println("Encertat!");
					break;
				}
			}
			System.out.println("Nombre?");
			nombre = Entrada.readLine();
		}
		if (nombre.isEmpty()) {
			System.out.println("Cancel·lat!");
		}
	}
}
