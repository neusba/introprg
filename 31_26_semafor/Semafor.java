/* Programa per desenvolupar un assistent que decideixi que fer davant d'un semàfor verd, groc o vermell */

public class Semafor {
	public static void main(String[] args) {

		// Demanem el color a l'usuari
		System.out.println("Color?");
		String color = Entrada.readLine();
		
		// Programem la respota que donarà l'assisten segons el color escollit
		String resposta = switch (color) {
		case "groc" -> "corre!";
		case "vermell" -> "espera";
		case "verd" -> "passa";
		default -> "ves a l'oculista";
		};

		System.out.println(resposta);
	}
} 
