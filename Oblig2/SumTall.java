import java.util.Scanner;

class SumTall {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String innlest;
       int tall = 0;
       int sum = 0;



      while (true) {
            System.out.println("Tast in tall");
            innlest = input.nextLine();
            tall = Integer.parseInt(innlest);
            sum = sum + tall;
            if (tall == 0) {
            System.out.println(sum);
            break;
            }
      }
    }
}
