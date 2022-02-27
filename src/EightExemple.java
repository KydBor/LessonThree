public class EightExemple {
    public static void main(String[] args) {
        /*

         *
         **
         ***


         ***
         **
         *

         */
        for (int i = 1; i <= 3; i++) {
            for (int u = 0; u < i; u++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int q = 3; q > 0; q--) {
            for (int i = 0; i < 3 - q; i++) {
                System.out.print(' ');
            }
            for (int u = 0; u < q; u++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
