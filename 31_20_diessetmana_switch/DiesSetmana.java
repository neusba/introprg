/* Programming weekend days in switch structure */

public class DiesSetmana {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String dayString;

		switch (num){
			case 1: dayString = "Dilluns";
				break;
			case 2: dayString = "Dimarts";
				break;
			case 3: dayString = "Dimecres";
				break;
			case 4: dayString = "Dijous";
				break;
			case 5: dayString = "Divendres";
				break;
			case 6: dayString = "Dissabte";
				break;
			case 7: dayString = "Diumenge";
				break;
			default: dayString = "Día invàlid";
				 break;
		}
		System.out.println(dayString);
	}
}
