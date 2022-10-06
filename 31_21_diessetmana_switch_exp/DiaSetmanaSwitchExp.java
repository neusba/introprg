/* Programa que demana per entrada estàndard un número entre l'1 i el 7 i torna per pantalla el día de la setmana corresponent, en aquest cas utilizarem la expressió switch i l'operador ternari. */

public class DiaSetmanaSwitchExp {
	public static void main(String[] args) {
	int number = Integer.parseInt(args[0]);
		
	String dayString = switch (number)  {
			case 1 -> "Dilluns";
			case 2 -> "Dimarts";
			case 3 -> "Dimecres";
			case 4 -> "Dijous";
			case 5 -> "Divendres";
			case 6 -> "Dissabte";
			case 7 -> "Diumenge";
			default -> "Error";
			};

	System.out.println(dayString);
	}
}
			
