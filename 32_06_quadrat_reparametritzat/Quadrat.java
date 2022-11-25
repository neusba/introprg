/* Nova versió del quadrat parametritzat que mostra un caràcter diferent a X a partir del que main rebi a args */

public class Quadrat {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String character = Entrada.readLine();
		char ch = character.charAt(0);
		dibuixaQuadrat(num, ch);
	}

	public static void dibuixaQuadrat(int num, char ch) {
		for (int i=0; i < num; i++) {
			dibuixaLinia(num, ch);
			System.out.println();
		}
	}

	public static void dibuixaLinia(int num, char ch) {
		for (int j=0; j < num; j++) {
			System.out.printf(" %c", ch);
		}
	}
}
