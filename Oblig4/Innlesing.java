import java.util.Scanner;
import java.io.File;


class Innlesing {
    public static void main(String[] args) throws Exception {
      // Variable
      Scanner readFile = new Scanner(new File("winnie.txt"));
	    Scanner tastaur = new Scanner(System.in);
      String[] ord = new String[242];
	    int teller = 0;
      int ordTeller = 0;
      String find = tastaur.nextLine();
      //  b) String find = "winnie-the pooh";

      // fylle arrayen med tekst
      while(readFile.hasNextLine()) {
        ord[teller] = readFile.nextLine();
        ++teller;

	    }
       // sjekke antall forekomst av ordet fra winnie.txt
      for(String s : ord) {
        if(s.equals(find)) {
          ++ordTeller;
	      }
	    }
      System.out.println("Det er totalt" + " " + ordTeller + " " + "av det ordet i winnie.txt");
    }
}
