import java.util.Scanner;

class LikeVerdier {
  public static void main(String[] args)
  {
    // Input via terminal,
    Scanner alderscan = new Scanner(System.in);

    System.out.print("Tast in verdi for c:  ");
    int c = alderscan.nextInt();

    System.out.print("Tast in verdi for d:  ");
    int d = alderscan.nextInt();

    if (c == d) {
      System.out.println("C og D er like");
    }
    else if (c > d) {
      System.out.println("c er bigger en D");
    }
    else if (c < d) {
      System.out.println("c er mindre en D");
    }
  }

}
