/* Programa que demana un mes i un any a l'usuari i torna per pantalla el mes anterior i el següent */

public class MesosAnys {
	public static void main(String [] args) {
		System.out.println("Mes?");
		int  month = Integer.parseInt(Entrada.readLine());
			
		System.out.println("Any?");
		int year = Integer.parseInt(Entrada.readLine());

		if (month > 12 || month < 1) {
			System.out.println("Error");
		} else if (month == 1) {
			System.out.println("Mes anterior " + 12 + "/" + (year - 1) + " i mes següent " + (month + 1) + "/" + year);
		} else if (month > 1 && month < 12) {
			System.out.println("Mes anterior " + (month - 1) + "/" + year + " i mes següent " + (month + 1) +  "/" + year);
		}		
	}
}
