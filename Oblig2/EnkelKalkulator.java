// Import av scanner
import java.util.Scanner;

class EnkelKalkulator	{
    // Main med valg of metoder + velkomst
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		int valg = 0;

		// Velkomst med enkel meny for aa taste in 2 tall
		System.out.println("Velkommen til EnkelKalkulator");
		System.out.println("Tast in tall 1 saa Enter");
		int tall1 = Integer.parseInt(input.nextLine());
		System.out.println("Tast in tall 2 saa Enter");
		int tall2 = Integer.parseInt(input.nextLine());

		// Etter du har taste in 2 tall, vil dette kjøre
		meny();
		valg = Integer.parseInt(input.nextLine());
		if ( valg == 1) {
			plus(tall1, tall2);
		}
		if ( valg == 2) {
			differansen(tall1, tall2);
		}
		if ( valg == 3) {
			multi(tall1, tall2);
		}
	}
	  // Meny  metode
		static void meny() {
			System.out.println("Tast 1 for addisjon");
			System.out.println("Tast 2 for differansen");
			System.out.println("Tast 3 for multiplikasjon");
		}
		// Metode for plus
		static void plus(int tall1, int tall2) {
		 System.out.println("Summen blir" + " " + (tall1 + tall2));
	 }
	  // Metode for differanse
		static void differansen(int tall1, int tall2) {

			 if (tall1 < tall2) {
				 System.out.println("Summen blir" + " " + (tall2 - tall1));
			 }
			 else if (tall1 > tall2) {
				 System.out.println("Summen blir" + " " + (tall1 - tall2));
			 }

		 }
    // Metode for multiplikasjon
		static void multi(int tall1, int tall2) {
			System.out.println("Summen blir" + " " + (tall1 * tall2));
		}
 }
