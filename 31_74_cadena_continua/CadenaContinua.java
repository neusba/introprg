/* Programa que demana un text i un nombre enter i mostri tants caràcters del text com indiquin els nombres enters, començant pel primer. En cas que faltin, el programa tornarà a mostrar el text a partir del primer caràcter fins que hagi aconseguit tots els demanats */ 

public class CadenaContinua {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		if (text.isEmpty()) {
			System.out.println("error");
		} else {
			System.out.println("Nombre?");
			int nombre = Integer.parseInt(Entrada.readLine());
			if (nombre >= 1) {
				int modul = nombre % (text.length()); // Serán les lletres extres després de la paraula estàndar. 
				int repeticio = nombre / text.length(); // La repetició és les vegades que es repetirà la paraula sencera per omplir el recorregut dels caràcter demanats
				if (modul == 0) {
					System.out.print(text.repeat(repeticio)); // Si el mòdul eś 0 no podem saber les lletres restants, però amb la repetició sabem quantes vegades es repeteix la paraula en el recorregut	
				} else if (modul != 0) {
					System.out.print(text.repeat(repeticio)); // En aquest cas la repeticio la utilitzem per saber quantes vegades està la paraula estàndar abans de les lletres extres
					for (int inici=0; inici < modul; inici++) {
						System.out.print(text.charAt(inici));
					}
				}
			}
		}
	}
}
		
	

			
