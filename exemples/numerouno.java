/* Ejercicio uno super chungo */

public class numerouno {
	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);
		boolean suficient = numero >= 10 && numero != 42;

		while (suficient) {
			if (numero < 100) {
				numero -= 1;
			}
			suficient = numero >= 10;
		}
		System.out.println(numero);

		String missatge = "uficient";
		if (suficient || numero == 42) {
			missatge = "S" + missatge;
		} else if (suficient != false) {
			missatge = "No s" + missatge;
		} else {
			missatge = "Ins"+ missatge;
		}
		System.out.println(missatge);
	}
}
