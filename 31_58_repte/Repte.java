/* Creació pròpia amb bucles for */

public class Repte {
	public static void main(String[] args) {		
		// Frente
		for (int i=0; i < 4; i++) {
			for (int j=0; j < 20; j++) {
				System.out.print(".");
			}
			for (int j=0; j <= 20; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 20; j++) {
				System.out.print(".");
			}
			System.out.println();	
		}
		// Ojos
		for (int i=0; i < 5; i++) {
			for (int j=0; j < 20; j++) {
				System.out.print(".");
			}
			for (int j=0; j < 3; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 5; j++) {
				System.out.print("▩ ");
			}
			for (int j=0; j < 5; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 5; j++) {
				System.out.print("▩ ");
			}
			for (int j=0; j < 3; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 20; j++) {
				System.out.print(".");
			}
			System.out.println();
		}
		// Nariz
		for (int i=0; i < 2; i++) {
			for (int j=0; j < 20; j++) {
				System.out.print(".");
			}
			for (int j=0; j < 8; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 5; j++) {
				System.out.print("▩ ");
			}
			for (int j=0; j < 8; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 20; j++) {
				System.out.print(".");
			}
			System.out.println();
		}
		// Morro
		for (int i=0; i < 4; i++) {
			for (int j=0; j < 20; j++) {
				System.out.print(".");
			}
			for (int j=0; j < 5; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 11; j++) {
				System.out.print("▩ ");
			}
			for (int j=0; j < 5; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 20; j++) {
				System.out.print(".");
			}
			System.out.println();
		}
		// Bigote
		for (int i=0; i < 5; i++) {
			for (int j=0; j < 20; j++) {
				System.out.print(".");
			}
			for (int j=0; j < 5; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 3; j++) {
				System.out.print("▩ ");
			}
			for (int j=0; j < 5; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 3; j++) {
				System.out.print("▩ ");
			}
			for (int j=0; j < 5; j++) {
				System.out.print("❏ ");
			}
			for (int j=0; j < 20; j++) {
				System.out.print(".");
			}
			System.out.println();
		}
		// Cuerpo
		for (int i=0; i < 30; i++) {
			for (int j=0; j < 23; j++) {
				System.out.print(".");
			}
			for (int j=0; j < 18; j++) {
				System.out.print("❐ ");
			}
			for (int j=0; j < 23; j++) {
				System.out.print(".");
			}
			System.out.println();
		}
		// Pies
		for (int i=0; i < 8; i++) {
			for (int j=0; j < 19; j++) {
				System.out.print(".");
			}
			for (int j=0; j < 22; j++) {
				System.out.print("☲ ");
			}
			for (int j=0; j < 19; j++) {
				System.out.print(".");
			}
			System.out.println();
		}


	}
}

