/* Programa que demostra diferents manipulacions amb Strings */

public class ManipulaString {
	public static void main(String[] args) {
		System.out.println("Paraula?");
		String paraula = Entrada.readLine();
		
		if (paraula.isEmpty() || paraula.isBlank()) {
			System.out.println("Caràcter invàlid");
		} else {
			// Longitud de la paraula
			System.out.println("La longitud és " + paraula.length());

			// Mostra la segona lletra de la paraula
			System.out.println("La segona lletra és " + "\'" + paraula.charAt(1) + "\'");

			// Mostra la darrera lletra de la paraula
			System.out.println("La darrera lletra és " + "\'" + paraula.charAt(paraula.length() - 1) + "\'");

			// Mostra la penúltima lletra de la paraula
			System.out.println("La penúltima lletra és " + "\'" + paraula.charAt(paraula.length() - 2) + "\'");

			// Mostra la paraula amb totes les lletres en majúscules
			System.out.println("La paraula en majúscules és " + "\"" + paraula.toUpperCase() + "\"");

			// Composició formada per la primera lletra de la paraula en majúscules i les següents tres lletres en minúscules
			System.out.print("La composició de quatre primeres és ");	
				// Primera lletra
			char primera = Character.toUpperCase(paraula.charAt(0));
			System.out.print("\"" + primera);
				// Segona lletra
			char segona = Character.toLowerCase(paraula.charAt(1));
			System.out.print(segona);
				// Tercera lletra
			char tercera = Character.toLowerCase(paraula.charAt(2));
			System.out.print(tercera);	
				// Quarta lletra
			char quarta = Character.toLowerCase(paraula.charAt(3));
			System.out.println(quarta + "\"");	

			// Composició formada per la darrera lletra de la paraula seguida de les tres primrees
			System.out.print("La composició de quatre és ");
				// Última lletra
			char ultima = paraula.charAt(paraula.length() - 1);
			System.out.print("\"" + ultima);
				// Segona lletra
			char primeraLletra = paraula.charAt(0);
			System.out.print(primeraLletra);
				// Tercera lletra
			char segonaLletra = paraula.charAt(1);
			System.out.print(segonaLletra);
				// Quarta lletra
			char terceraLletra  = paraula.charAt(2);
			System.out.println(terceraLletra + "\"");

			// Igual que abans però invertint majúscueles i minúscules
			System.out.print("La composició de quatre corregint majúscules és ");
				// Última lletra
			char ultimaMajus = Character.toUpperCase(paraula.charAt(paraula.length() - 1));
			System.out.print("\"" + ultimaMajus);
				// Primera lletra
			char primeraMajus = Character.toLowerCase(paraula.charAt(0));
			System.out.print(primeraMajus);
				// Segona lletra
			char segonaMajus = Character.toLowerCase(paraula.charAt(1));
			System.out.print(segonaMajus);
				// Tercera lletra
			char terceraMajus  = Character.toLowerCase(paraula.charAt(2));
			System.out.print(terceraMajus + "\"");

		}
			
	}
}
