import java.util.Scanner;
import java.io.File;

class Temperatur {
  public static void main(String[] args) throws Exception {
    Scanner tempScan = new Scanner(new File("temperatur.txt"));
    int[] tempMnd = new int[12];
    int teller = 0;
    int sum = 0;
    int average;

    /* loop med nextInt for å lese inn txt til arrayen
       Vet du vil jeg skal bruke interger.parseint
       men fikk ikke det til det her.
       noe hint på tilbakemelding?
    */
    while(tempScan.hasNextInt()) {
      tempMnd[teller] = tempScan.nextInt();
      teller++;
   }
    // loop for å summere slik jeg kan bruke det til gjennomsnitte
    for(int i = 0; i < tempMnd.length; i++) {
        sum += tempMnd[i];
    }
    // Regne ut gjennomsnitte + printe det ut
    average = sum / tempMnd.length;
    System.out.println("Gjennomsitt temp for i aar er :" + average);
    }
}
