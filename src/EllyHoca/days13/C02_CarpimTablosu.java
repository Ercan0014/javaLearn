package ellyhocanınDosya.days13;

    public class C02_CarpimTablosu {
    /* verilen sayi icin carpim tablosu olusturun
        Ornek :
            input  : 5
            output : 1  2  3  4  5
                     2  4  6  8 10
                     3  6  9 12 15
                     4  8 12 16 20
                     5 10 15 20 25

     */


        public static void main(String[] args) {

            //Call to multipleTable method inside main method
int tableIput=5;
multipleTable(tableIput);


        }

        private static void multipleTable(int tableIput) {
            for (int i = 1; i <=tableIput ; i++) {
                for(int j =1; j<=tableIput; j++){
                    System.out.printf("%3d",i*j);

            }
                System.out.println();
        }


        // Create a method an integer as parameter

    }



}
