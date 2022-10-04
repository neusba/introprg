/* Programa que demana un mes i un any a l'usuari i torna per pantalla el mes anterior i el següent */

public class MesosAnys {
	public static void main(String [] args) {
		System.out.println("Mes?");
		int  month = Integer.parseInt(Entrada.readLine());

		System.out.println("Any?");
		int year = Integer.parseInt(Entrada.readLine()); 

		System.out.println("Mes anterior " + (month - 1) + "/" + year + " i mes següent " + (month + 1) + "/" + year);

	}
}
