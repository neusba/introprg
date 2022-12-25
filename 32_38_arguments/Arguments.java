/* Programa que analitza els arguments que se li donen per la línia de comandes i respon si són nombres enters o no 
 */
public class Arguments {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Cap argument");
			return;
		}
		for (int i=0; i<args.length; i++) {
			boolean esEnter = UtilString.esEnter(args[i]);
			if (esEnter) {
				System.out.printf("[%d] \"%s\": és enter%n", i, args[i]);
			} else {
				System.out.printf("[%d] \"%s\": no és enter%n", i, args[i]);
			}
		}
	}
}
