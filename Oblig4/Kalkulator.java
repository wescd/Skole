class Kalkulator	{
	public static void main(String[] args ) {
    int addSvar = addisjon(3,4);
    System.out.println(addSvar);

    int subSvar = subtrakjon(5,2);
    System.out.println(subSvar);

    int helDivSvar = heltalldivisjon(10, 3);
    System.out.println(helDivSvar);

    double divSvar = divisjon(10, 3);
    System.out.println(divSvar);
	}

		// Metode for plus
	static int addisjon(int tall1, int tall2) {
		int addisjon = tall1 + tall2;
    return addisjon;
	}
	// Metode for subtrakjon
	static int subtrakjon(int tall1, int tall2) {
    int subtrakjon = tall1 - tall2;
    return subtrakjon;
	}
  // Metode for multiplikasjon
  static int heltalldivisjon(int tall1, int tall2) {
    int heltalldivisjon = tall1 / tall2;
    return heltalldivisjon;
  }
  static double divisjon(double tall1, double tall2) {
    double divisjon = ((double) tall1 / (double) tall2);
    return divisjon;
  }
}
