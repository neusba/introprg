/* Programa que demana dos String a l'usuari i un número enter positiu */

public class InformeString {
	public static void main(String[] args) {
		System.out.println("Text principal?");
		String stringPrincipal = Entrada.readLine();
		System.out.println("Text secundari?");
		String stringSecundari = Entrada.readLine();
		System.out.println("Número positiu?");
		int numero = Integer.parseInt(Entrada.readLine());

		// Informe
		System.out.print("\"String!\".length(): ");
		System.out.println(stringPrincipal.length());

		System.out.print("\"String!\".startsWith(\"string!\"): ");
		System.out.println(stringPrincipal.startsWith(stringSecundari));

		System.out.print("\"String!\".endsWith(\"string!\"): ");
		System.out.println(stringPrincipal.endsWith(stringSecundari));

		System.out.print("\"String!\".equals(\"string!\"): ");
		System.out.println(stringPrincipal.equals(stringSecundari));

		System.out.print("\"String!\".equalsIgnoreCase(\"string!\"): ");
		System.out.println(stringPrincipal.equalsIgnoreCase(stringSecundari));
	
		System.out.print("\"String!\".isBlank(): ");
		System.out.println(stringPrincipal.isBlank());

		System.out.print("\"String!\".isEmpty(): ");
		System.out.println(stringPrincipal.isEmpty());
		
		System.out.print("\"String!\".charAt(numero)): ");
		char ch = stringPrincipal.charAt(numero);
		System.out.println(ch);
		
		System.out.print("\"String!\".concat(\"string!\"): ");
		System.out.println(stringPrincipal.concat(stringSecundari));
		
		System.out.print("\"String!\".repeat(): ");
		System.out.println(stringPrincipal.repeat(numero));

		System.out.print("\"String!\".toUpperCase(): ");
		System.out.println(stringPrincipal.toUpperCase());

		System.out.print("\"String!\".toLowerCase(): ");
		System.out.println(stringPrincipal.toLowerCase());
	}
}
		

