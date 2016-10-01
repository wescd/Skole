class Isbod {
  private int antall;
  private String [] ansatte = new String[10];


  public void ansett (String navn) {
    for(int i = 0; i <ansatte.length; i++) {
       if(ansatte[i] == null) {
         ansatte[antall] = navn;
         ++antall;
         break;
       }
   }
 }

  public void giSisteMannSparken() {
    System.out.println(antall);
  }
  public void printAlleAnsatte() {
    for(int i=0;i<ansatte.length;i++) {
    System.out.println(toStringArrayNonNulls(ansatte));
    }
  }
}
