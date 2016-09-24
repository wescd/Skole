class Alternativ2 {
    public static void main(String[] args) {
       int[] poeng = new int[] {40,36,35,31,30,23,22,18,17,16,15,1337};
       int[] poeng2 = new int[] {37,25,20,31,33,2,38,40,25,24,20,23};
       System.out.println("Test 1");
       skrivKaraktorprotokoll(poeng);
       System.out.println(" ");
       System.out.println("Test 2");
       skrivKaraktorprotokoll(poeng2);
    }


    static void skrivKaraktorprotokoll(int[] poeng) {
         int teller = 0;
         char kara = 0;
           for (int i = 0; i < poeng.length; i++){
                teller = teller + 1;
                if (poeng[i] <= 40 && poeng[i] >= 36 ) {
                kara = 'A';
                }
                else if (poeng[i] <= 35 && poeng[i] >= 31 ) {
                kara = 'B';
                }
                else if (poeng[i] <= 30 && poeng[i] >= 23 ) {
                kara = 'C';
                }
                else if (poeng[i] <= 22 && poeng[i] >= 18 ) {
                kara = 'D';
                }
                else if (poeng[i] <= 17 && poeng[i] >= 16 ) {
                kara = 'E';
                }
                else if (poeng[i] <= 15 && poeng[i] >= 0 ) {
                kara = 'F';
                }
                System.out.println("Kandidatnummer" + " " + teller
                + ": " + kara);
           }
    }
}
