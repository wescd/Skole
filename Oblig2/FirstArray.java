import java.util.Arrays;
import java.util.Scanner;


class FirstArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] tall = new int[4];
        String [] navn = new String[4];

       // loop for å fylle 0 1 2 3
       for (int i=0;i<tall.length;i++) {
       tall[i] = i;
       }

      // bruker loop til input til String Array
      System.out.println("Tast in 5 navn");
      for (int i=0;i<navn.length;i++) {
      navn[i] = input.nextLine();
      }

     // Skriver ut int array til terminal, endring av array til leet
      for(int i=0;i<tall.length;i++) {
      tall[0] = 1337;
      tall[3] = 1337;
      System.out.println(tall[i]);
      }

     // Skrive ut String Array til terminal
     for(int i=0;i<tall.length;i++) {
     System.out.println(navn[i]);
     }

  }
}
