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
		System.out.print("\"stringPrincipal\".length(): ");
		System.out.println(stringPrincipal.length());

		System.out.print("\"stringPrincipal\".startswith(\"stringSecundari\"): ");
		System.out.println(stringPrincipal.startsWith(stringSecundari));

		System.out.print("\"stringPrincipal\".endsWith(\"stringSecundari\"): ");
		System.out.println(stringPrincipal.endsWith(stringSecundari));

		System.out.print("\"stringPrincipal\".equals(\"stringSecundari\"): ");
		System.out.println(stringPrincipal.equals(stringSecundari));

		System.out.print("\"stringPrincipal\".equalsIgnoreCase(\"stringSecundari\"): ");
		System.out.println(stringPrincipal.equalsIgnoreCase(stringSecundari));
	
		System.out.print("\"stringPrincipal\".isBlank(): ");
		System.out.println(stringPrincipal.isBlank());

		System.out.print("\"stringPrincipal\".isEmpty(): ");
		System.out.println(stringPrincipal.isEmpty());
		
		System.out.print("\"stringPrincipal\".charAt()): ");
		char ch = stringPrincipal.charAt(numero);
		System.out.println(ch);
		
		System.out.print("\"stringPrincipal\".concat(\"stringSecundari\"): ");
		System.out.println(stringPrincipal.concat(stringSecundari));
		
		System.out.print("\"stringPrincipal\".repeat(): ");
		System.out.println(stringPrincipal.repeat(numero));

		System.out.print("\"stringPrincipal\".toUpperCase(): ");
		System.out.println(stringPrincipal.toUpperCase());

		System.out.print("\"stringPrincipal\".toLowerCase(): ");
		System.out.println(stringPrincipal.toLowerCase());
	}
}
		

