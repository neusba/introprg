/* Programa que demana un string a l'usuaro o respecte al primer caràcter del string composa un petit informe amb les funcions anteriorment vistes */

public class InformeCaracter {
	public static void main(String[] args) {
		System.out.println("Caràcter?");
		String string = Entrada.readLine();

		if (string.isEmpty()) {
			System.out.println("Caràcter buit");
		}
		
		String getName = string.format("Character.getName(\'%s\'): ", string.charAt(0));
	      	System.out.println(getName + Character.getName(string.charAt(0)));
		
		String isDigit = string.format("Character.isDigit(\'%s\'): ", string.charAt(0));
	      	System.out.println(isDigit + Character.isDigit(string.charAt(0)));
		
		String identifierStart = string.format("Character.isJavaIdentifierStart(\'%s\'): ", string.charAt(0));
	      	System.out.println(identifierStart + Character.isJavaIdentifierStart(string.charAt(0)));
		
		String identifierPart = string.format("Character.isJavaIdentifierPart(\'%s\'): ", string.charAt(0));
	      	System.out.println(identifierPart+ Character.isJavaIdentifierPart(string.charAt(0)));
		
		String letter = string.format("Character.isLetter(\'%s\'): ", string.charAt(0));
	      	System.out.println(letter + Character.isLetter(string.charAt(0)));
		
		String lowerCase = string.format("Character.isLowerCase(\'%s\'): ", string.charAt(0));
	      	System.out.println(lowerCase + Character.isLowerCase(string.charAt(0)));
		
		String upperCase = string.format("Character.isUpperCase(\'%s\'): ", string.charAt(0));
	      	System.out.println(upperCase + Character.isUpperCase(string.charAt(0)));
		
		String whiteSpace = string.format("Character.isWhitespace(\'%s\'): ", string.charAt(0));
	      	System.out.println(whiteSpace+ Character.isWhitespace(string.charAt(0)));
		
		String toLowerCase = string.format("Character.toLowerCase(\'%s\'): ", string.charAt(0));
	      	System.out.println(toLowerCase + Character.toLowerCase(string.charAt(0)));
		
		String toUpperCase = string.format("Character.toUpperCase(\'%s\'): ", string.charAt(0));
	      	System.out.println(toUpperCase + Character.toUpperCase(string.charAt(0)));
	}
}	
