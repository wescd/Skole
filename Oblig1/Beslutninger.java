import java.util.Scanner;

class Beslutninger {
  public static void main(String [] args)
  {
   // Input via terminal
   Scanner scan = new Scanner(System.in);

   System.out.print("Tast in din Alder:  ");
   int alder = scan.nextInt();

   // Checking if you are over or under 18
   if ( alder <= 18) {
   System.out.println("Du er ikke myndig");

   }
   else {
     System.out.println("Du er myndig");
   }

}

}
