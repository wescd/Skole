import java.util.Scanner;

class Billettpris {
  public static void main(String[] args)
  {
  // Input via terminal
  Scanner alderscan = new Scanner(System.in);

  System.out.print("Tast in din Alder:  ");
  int alder = alderscan.nextInt();
  int billetpris = 50;
  int tilbud = 25;

  if (alder <= 12) {
    System.out.println("det koste:" + (billetpris-tilbud) + "kr");
  }
  else if (alder >= 67) {
    System.out.println("det koste:" + (billetpris-tilbud) + "kr");
  }
  else if (alder > 13 && alder <= 66) {
    System.out.println("det koste:" + (billetpris) + "kr");
  }

 }

}
