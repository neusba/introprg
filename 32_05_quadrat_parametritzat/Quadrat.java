/* Programa que demana un valor positiu en args[0] i dibuixi un quadrat amb el nombre de costats igual que el valor rebut per linia de comanda */

public class Quadrat {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		dibuixaQuadrat(num);
	}

	public static void dibuixaQuadrat(int num) {
		for (int i=0; i < num; i++) {
			dibuixaLinia(num);
			System.out.println();
		}
	}

	public static void dibuixaLinia(int num) {
		for (int j=0; j < num; j++) {
			System.out.print(" X");
		}
	}
}
