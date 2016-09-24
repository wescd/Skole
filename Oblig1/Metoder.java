// Importere Scanner
import java.util.Scanner;

public class Metoder {
   public static void main(String[] args) {
   person1();
   person2();
   person3();

 }
   // Metoder som blir repetert 3 ganger
   public static void person1() {
    Scanner info = new Scanner(System.in);
      System.out.println("Hva heter du?");
      String navn1 = info.nextLine();
      System.out.println("Hvor Bor Du?");
      String bosted1 = info.nextLine();

      System.out.println("Hei" + " " + navn1 + " " + "Du er fra" + " " + bosted1);

   }
   public static void person2() {
    Scanner info = new Scanner(System.in);
      System.out.println("Hva heter du?");
      String navn2 = info.nextLine();
      System.out.println("Hvor Bor Du?");
      String bosted2 = info.nextLine();

      System.out.println("Hei" + " " + navn2 + " " + "Du er fra" + " " + bosted2);

   }
   public static void person3() {
    Scanner info = new Scanner(System.in);
      System.out.println("Hva heter du?");
      String navn3 = info.nextLine();
      System.out.println("Hvor Bor Du?");
      String bosted3 = info.nextLine();

      System.out.println("Hei" + " " + navn3 + " " + "Du er fra" + " " + bosted3);

   }

}
