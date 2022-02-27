public class SixExemple {
    public static void main(String[] args) {
/*Напишите программу вывода всех четных чисел от 2 до 100
включительно */
        int i;
        for (i = 2; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println( );

        int u = 0;
        while(u < 100) {
            u += 2;
            System.out.print(u + " ");
        }
        System.out.println( );

        int y = 0;
        do {
            y += 2;
            System.out.print(y + " ");
        } while (y < 100);
    }
}
