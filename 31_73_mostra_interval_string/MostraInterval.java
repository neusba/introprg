/* Programa que demana un text i dos valor enters i que mostri tots els carácters entre el primer i el segon marcats per l'ordre de l'entrada donada per l'usuari */

public class MostraInterval {
	public static void main(String [] args) {
		System.out.println("text?");
		String text = Entrada.readLine();
		System.out.println("inici?");
		int inici = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int valorFinal = Integer.parseInt(Entrada.readLine());
		
		if (inici < 0) {
			if (valorFinal >= 0 && valorFinal <= text.length() - 1) {
				for (int i=0; i <= valorFinal; i++) {
					System.out.println(text.charAt(i));
				}
			} else if (valorFinal > text.length() - 1) {
				for (int i=0; i <= text.length() - 1; i++) {
					System.out.println(text.charAt(i));
				}
			} else if (valorFinal < 0) {
				for (int i=0; i < 1; i++) {
					System.out.println(text.charAt(i));
				}
			}
		} else if (inici > text.length() - 1) {
			if (valorFinal >= 0 && valorFinal <= text.length() - 1) {
				for (int i=text.length() - 1; i >= valorFinal; i--) {
					System.out.println(text.charAt(i));
				}
			} else if (valorFinal < text.length() - 1) {
				for (int i=text.length() - 1; i >= 0; i--) {
					System.out.println(text.charAt(i));
				}
		} else if (inici >= 0 && inici <= text.length() - 1) {
			if (valorFinal >= 0 && valorFinal <= text.length() - 1) {
				if (valorFinal > inici) {
					for (int i=inici; i <= valorFinal; i++) {
						System.out.println(text.charAt(i)); }
				} else {
					for (int i=inici; i >= valorFinal; i--) {
						System.out.println(text.charAt(i));
					}
				}
			} else if (valorFinal > text.length() - 1) {
				for (int i=inici; i <= text.length() - 1; i++) {
					System.out.println(text.charAt(i));
				}
			} else if (valorFinal < 0) {
				for (int i=inici; inici >= 0; i--) {
					System.out.println(text.charAt(i));
				}
			}
		}
		}	
	}
}
