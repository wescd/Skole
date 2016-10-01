class Oppgave51 {
  public static void main(String[] args) {
    Bil willi = new Bil(2.0, 50);

    willi.kjorTur(25);
    // willi.fyllTank(999.9);
    // willi.kjorTur(10000);

    System.out.println("-----------------------------");
    System.out.println("Kilometerstand");
    System.out.println(willi.hentKilometerstand());
    System.out.println("-----------------------------");
    System.out.println("-----------------------------");
    System.out.println("Bensin Tank");
    System.out.println(willi.hentBensinitank());
    System.out.println("-----------------------------");
    System.out.println("-----------------------------");
    System.out.println("Maks Distanse");
    System.out.println(willi.hentMaksDistanse());
    System.out.println("-----------------------------");
  }
}
