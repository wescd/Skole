import java.util.Arrays;

class Isbod {
  private int antall;
  private String [] ansatte = new String[10];
  private String ledig = null;


  public void ansett (String navn) {
    for(int i = 0; i <ansatte.length; i++) {
       if(ansatte[i] == null) {
         ansatte[antall] = navn;
         ++antall;
         System.out.println("-------------------");
         System.out.println("Du har ansatt :" + navn);
         System.out.println("-------------------");
         break;
       }
   }
 }

  public void giSisteMannSparken() {

    for (int i = 0; i >ansatt
  }
  public void printAlleAnsatte() {
    System.out.println("-------------------");
    System.out.println("Liste over Ansatte");
    System.out.println("-------------------");
    for(int i=0;i<ansatte.length;i++) {
    System.out.println(ansatte[i]);
    }
    System.out.println("-------------------");
  }
}
