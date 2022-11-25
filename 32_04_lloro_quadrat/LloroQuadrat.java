/* Programa del lloro que va demanant texts i els repeteix fins que arriba a un text en blanc o buit. Si demana dibuixar un rectangle o un quadrat, mostrarà el dibuix per pantalla */

public class LloroQuadrat {
	public static void main(String[] args) {
		lloroDemana();
	}
		
	// dona una resposta segons la paraula introduida
	public static void lloroDemana() {
		boolean vacio = false;
		while (!vacio) {
			System.out.println("El lloro espera paraula:");
			String paraula = Entrada.readLine();
			if (!paraula.isEmpty() || !paraula.isBlank()) {
				if (paraula.equals("dibuixa quadrat")) {
					dibuixaQuadrat();
				} else if (paraula.equals("dibuixa rectangle")) {
					dibuixaRectangle();
				} else {
					System.out.printf("El lloro repeteix: %s", paraula);
					System.out.println();
				}
			} else {
				vacio = true;
			}
		}
		lloroAdeu();
	}

	// ====== Dibuixa rectangle ======
	
	public static void dibuixaRectangle() {
		for (int i=0; i < 5; i++) {
			dibuixaLinia();
			dibuixaLinia();
			System.out.println();
		}
	}
	
	// ====== Dibuixa quadrat ======

	public static void dibuixaQuadrat() {
		for (int i=0; i < 5; i++) {
			dibuixaLinia();
			System.out.println();
		}
	}

	public static void dibuixaLinia() {
		for (int j=0; j < 5; j++) {
			System.out.print(" X");
		}
	}

	// el lloro es despedeix
	public static void lloroAdeu() {
		System.out.println("Adèu");
	}
}

