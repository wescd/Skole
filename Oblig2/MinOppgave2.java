import java.util.Scanner;

// a) Lag en program som tar imot input navn. og int alder
//    Programmet skal innholde metode med parameter.


class MinOppgave2 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int alder = 0;
    String navn;

    System.out.println("Hei, Hva heter du?");
    navn = input.nextLine();
    System.out.println("Hvor gammel er du?");
    alder = Integer.parseInt(input.nextLine());
    check(alder);


 }
 static void check(int alder)  {
   if (alder < 18) {
     System.out.println("Du er ikke myndig");
      }
    else if (alder >= 18) {
      System.out.println("Du er myndig");
    }
 }
}
