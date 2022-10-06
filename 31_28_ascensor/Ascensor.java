/* Programa que simula un ascensor i indica el pis en el que està i quants puja o baixa */

public class Ascensor {
	public static void main(String [] args) {
		// Primer demanem el pis en el que ens trobem a l'usuari
		System.out.println("pis?");
		String pisActual = Entrada.readLine();

		// Demanem el botó que vol presionar l'usuari
		System.out.println("botó?");
		String boto = Entrada.readLine();


		// Programem en quin pis acabará l'ascensor despŕes de la resposta de l'usuari
		if (pisActual.equals("planta baixa")) {
			if (boto.equals("pujar un")) {
				System.out.println("primer pis");
			} else if (boto.equals("pujar dos")) {
				System.out.println("segon pis");
			} else if (boto.equals("baixar un")) {
				System.out.println("error");
			} else if (boto.equals("baixar dos")) {
				System.out.println("error");
			}
		} else if (pisActual.equals("primer pis")) {
			if (boto.equals("pujar un")) {
				System.out.println("segon pis");
			} else if (boto.equals("pujar dos")) {
				System.out.println("error");
			} else if (boto.equals("baixar un")) {
				System.out.println("planta baixa");
			} else if (boto.equals("baixar dos")) {
				System.out.println("error");
			}
		} else if (pisActual.equals("segon pis")) {
			if (boto.equals("pujar un")) {
				System.out.println("error");
			} else if (boto.equals("pujar dos")) {
				System.out.println("error");
			} else if (boto.equals("baixar un")) {
				System.out.println("primer pis");
			} else if (boto.equals("baixar dos")) {
				System.out.println("planta baixa");
			}
		}
	}
}
