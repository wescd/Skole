import java.util.Scanner;
import java.io.File;


class Valg {
    public static void main(String[] args) throws Exception {
      // variable
      String[] vote = new String[456];
      int [] parti = new int[4];
      int teller = 0;

      copyFile(vote,teller);
      countVote(vote, parti);
      int max = maxVerdi(parti);
      vinner(parti, max);
      prosent(parti);

   }
   // Metode fylle arrayen med tekst fra stemmer.txt
   static void copyFile(String[] vote, int teller) throws Exception {
     Scanner readFile = new Scanner(new File("stemmer.txt"));
     while(readFile.hasNextLine()) {
       vote[teller] = readFile.nextLine();
       teller++;
     }
   }
   // Metode for å sette in stemme på det 4 ulike parti
   static void countVote(String[] vote, int[] parti) {
     String findAp = "Ap";
     String findKrF = "KrF";
     String findSp = "Sp";
     String findH = "H";

     for(String i : vote) {
       if(i.equals(findAp)) {
         parti[0] += 1;
       }
       if(i.equals(findKrF)) {
         parti[1] += 1;
       }
       if(i.equals(findSp)) {
         parti[2] += 1;
       }
       if(i.equals(findH)) {
         parti[3] += 1;
       }
    }
   }
   static void vinner(int [] parti, int max) {
     if(max <= parti[0]) {
       System.out.println("Ap vant valget med" + " " +max+ " " + "stemmer");
     }
     if(max <= parti[1]) {
       System.out.println("KrF vant valget med" + " " +max+ " " + "stemmer");
     }
     if(max <= parti[2]) {
       System.out.println("Sp vant valget med" + " " +max+ " " + "stemmer");
     }
     if(max <= parti[3]) {
       System.out.println("H vant valget med" + " " +max+ " " + "stemmer");
     }
  }
  static int maxVerdi(int[] parti){
      int maxVerdi = parti[0];
      for (int i=1;i < parti.length;i++) {
        if(parti[i] > maxVerdi){
          maxVerdi = parti[i];
        }
      }
      return maxVerdi;
  }
  // Metode prosent regning
  static void prosent(int[] parti) {
     int totalt = 456;
     float prosentAp = (parti[0] * 100 / totalt);
     float prosentKrF = (parti[1] * 100 / totalt);
     float prosentSp = (parti[2] * 100 / totalt);
     float prosentH = (parti[3] * 100 / totalt);
     System.out.println("Ap fikk" + " " + prosentAp + "%");
     System.out.println("KrF fikk" + " " + prosentKrF + "%");
     System.out.println("Sp fikk" + " " + prosentSp + "%");
     System.out.println("H fikk" + " " + prosentH + "%");
  }
}
