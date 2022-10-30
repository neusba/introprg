/* Programa que demana dos string i un número enter positiu per pantalla i mostra les diferents utilitats de cada métode */

public class InformeString {
	public static void main(String[] args) {
		System.out.println("Text principal?");
		String stringP = Entrada.readLine();
		System.out.println("Text secundari?");
		String stringS = Entrada.readLine();
		System.out.println("Número positiu?");
		int num = Integer.parseInt(Entrada.readLine());

		String length = stringP.format("\"%s\".length(): ", stringP);
		System.out.println(length + stringP.length());
	
		String start = stringP.format("\"%s\".startsWith(\"%s\"): ", stringP, stringS);
		System.out.println(start + stringP.startsWith(stringS));
	
		String end = stringP.format("\"%s\".endsWith(\"%s\"): ", stringP, stringS);
		System.out.println(end + stringP.endsWith(stringS));
	
		String equals = stringP.format("\"%s\".equals(\"%s\"): ", stringP, stringS);
		System.out.println(equals + stringP.equals(stringS));
	
		String equalsIgnore = stringP.format("\"%s\".equalsIgnoreCase(\"%s\"): ", stringP, stringS);
		System.out.println(equalsIgnore + stringP.equalsIgnoreCase(stringS));

		String blank = stringP.format("\"%s\".isBlank(): ", stringP);
		System.out.println(blank + stringP.isBlank());
	
		String empty = stringP.format("\"%s\".isEmpty(): ", stringP);
		System.out.println(empty + stringP.isEmpty());
	
		String ch = stringP.format("\"%s\"charAt(\"num\"): ", stringP, num);
		System.out.println(ch + stringP.charAt(num));
	
		String concat = stringP.format("\"%s\".concat(\"%s\"): ", stringP, stringS);
		System.out.println(concat + stringP.concat(stringS));
	
		String repeat = stringP.format("\"%s\"repeat(\"num\"): ", stringP, num);
		System.out.println(repeat + stringP.repeat(num));
	
		String toUpperCase = stringP.format("\"%s\"toUpperCase(): ", stringP);
		System.out.println(toUpperCase + stringP.toUpperCase());
	
		String toLowerCase = stringP.format("\"%s\"toLowerCase(): ", stringP);
		System.out.println(toLowerCase + stringP.toLowerCase());
	}
}


