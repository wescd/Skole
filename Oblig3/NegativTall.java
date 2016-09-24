import java.util.Arrays;

class NegativTall {
  public static void main(String[] args) {
    int array[] = new int[] {1, 4, 5, -2, -4, 6, 10, 3, -2};
    negativ(array);
    sortere(array);

    }


  // Metode med parameter + loop for aa telle negativ tall
  public static int negativ (int[] array) {
    int negative = 0;
    for (int i = 0; i < array.length; i++){
        if(array[i] < 0){
        negative = negative + 1;
        }
    }
    System.out.println("Det er" + " " + negative + " " + "tall");
    return negative;
    }

  // Metode for å sortere tall i rekkefolge
  public static void sortere(int[] array) {
        Arrays.sort(array);
        System.out.println("Sortere tall");
        System.out.println(Arrays.toString(array));
      }

  }
