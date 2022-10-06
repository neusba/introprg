/* Programa per desenvolupar un assistent que decideixi que fer davant d'un semàfor verd, groc o vermell */

public class Semafor {
	public static void main(String[] args) {

		// Demanem el color a l'usuari
		System.out.println("Color?");
		String color = Entrada.readLine();
		
		// Programem la respota que donarà l'assisten segons el color escollit
		if (color.equals("groc")) {
			System.out.println("corre!");
		} else if (color.equals("vermell")) {
			System.out.println("espera");
		} else if (color.equals("verd")) {
			System.out.println("passa");
		}
	}
} 
