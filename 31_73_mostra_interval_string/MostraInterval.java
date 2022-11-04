/* Programa que demana un text i dos valor enters i que mostri tots els carácters entre el primer i el segon marcats per l'ordre de l'entrada donada per l'usuari */

public class MostraInterval {
	public static void main(String [] args) {
		System.out.println("text?");
		String text = Entrada.readLine();
		System.out.println("inici?");
		int inici = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int valorFinal = Integer.parseInt(Entrada.readLine());
				
		if (inici < 0 || valorFinal > text.length() - 1) {
			if (inici < 0) {
				for (int a=0; a <= valorFinal; a++) {
					System.out.println(text.charAt(a));
				}
			} else if (valorFinal > text.length() - 1) {
				for (; inici < text.length(); inici ++) {
					System.out.println(text.charAt(inici));
				}	
			} else if (inici < 0 && valorFinal > text.length() - 1) {
				for (int a=0; a <= text.length() - 1; a++) {
					System.out.println(text.charAt(a));
			}
			}	
		} else if (inici <= valorFinal) {
			for (; inici <= valorFinal; inici++) {
				System.out.println(text.charAt(inici));
			}
		} else if (inici > valorFinal) {
			for (; inici > valorFinal; inici--) {
				System.out.println(text.charAt(inici));
			}
		
		}
	}
}
