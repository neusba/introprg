
public class TextRevesb {
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();

		for (int i=text.length() - 1; i >= 0; i--) {
			if (text.charAt(i) == 0) { // Por que no reconoce la posición 0?
				System.out.print(text.charAt(i));
			} else {
				System.out.print(text.charAt(i) + ", ");
			}
		}
	}
}
				
