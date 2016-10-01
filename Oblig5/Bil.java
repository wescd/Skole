class Bil {
  private double tankstorrelse;
  private double bensinitank;
  private double  bensinforbruk;
  private int  kilometerstand;



  public Bil(double bf, int ts) {
    bensinforbruk = bf;
    tankstorrelse = ts;
    bensinitank = ts;
  }
  // Nok bensin? Kjor "km" kilometer.
  public boolean kjorTur(int km) {
    if(km > (bensinitank / bensinforbruk)) {
      System.out.println("-----------------------------");
      System.out.println("Du har ikke nok bensin");
      System.out.println("-----------------------------");
    }
    if(km < (bensinitank / bensinforbruk)) {
      if(bensinitank > 0) {
        bensinitank -= (km / bensinforbruk);
        }
      }
    if (bensinitank <= 0) {
      System.out.println("-----------------------------");
      System.out.println("Bilen prove a starte");
      System.out.println("thshhshshshhshs");
      System.out.println("tom for bensin ?");
      System.out.println("-----------------------------");
    }
    return (double) bensinitank;
  }
  public double hentBensinitank() {
    return bensinitank;
  }
  // Fyll tanken, dersom det er plass til spesifisert mengde bensin.
  public double fyllTank(int liter) {
    if(liter > tankstorrelse) {
      System.out.println("-----------------------------");
      System.out.println("Du har ikke sa stor tank, dumming!");
      System.out.println("-----------------------------");
    }
    if(liter < tankstorrelse) {
      if(bensinitank > tankstorrelse) {
        bensinitank += (int)liter;
      }
    }
    if (liter == 0) {
      System.out.println("-----------------------------");
      System.out.println("Prove du a fylle pa null bensin?");
      System.out.println("-----------------------------");
    }
    else {
     System.out.println("-----------------------------");
     System.out.println("pipipPIPIEPIPe");
     System.out.println("Warning");
     System.out.println("Tanken er full");
     System.out.println("-----------------------------");
     }
  return bensinitank;
  }
  // Hent maksimal kjoredistanse, gitt bensinmengde på tanken.
  public double  hentMaksDistanse() {
   return (bensinitank / bensinforbruk);
  }

  // Hent bilens totale kilometerstand.
  public int  hentKilometerstand() {
    return kilometerstand;
  }
}
