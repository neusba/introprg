/** Programa que demani l'edat de l'usuari per entrada estàndard i mostri un missatge per pantalla */

public class Preso {
	public static void main(String[] args) {
		System.out.println("Com us dieu?");
		String nom = Entrada.readLine();
		System.out.println("Quants anys teniu?");
		int edat = Integer.parseInt(Entrada.readLine());
		if (edat >= 18)  {
			System.out.println("Vos ja podeu anar a la presó!");
		}
		System.out.println("Aneu amb compte " + nom);
	}
}
