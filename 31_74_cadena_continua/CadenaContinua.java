/* Programa que demana un text i un nombre enter i mostri tants caràcters del text com indiquin els nombres enters, començant pel primer. En cas que faltin, el programa tornarà a mostrar el text a partir del primer caràcter fins que hagi aconseguit tots els demanats */ 

public class CadenaContinua {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		System.out.println("Nombre?");
		int nombre = Integer.parseInt(Entrada.readLine());
		
		if (text.isEmpty() && text.isBlank()) {
			System.out.println("error");
		} else if (nombre > 1) {
			int modul = nombre % (text.length() - 1);
			if (modul == 0) {
				System.out.println(text);
			} else if (modul != 0) {
				int repeat = nombre / (text.length() - 1);
				System.out.print(text.repeat(repeat));
				for (int inici=0; inici <= modul; inici++) {
					System.out.print(text.charAt(inici));
				}
			}
		}
	}
}
			
