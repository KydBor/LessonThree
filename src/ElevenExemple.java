import java.util.Scanner;

public class ElevenExemple {
    public static void main(String[] args) {
        //    11.Определить, является ли число простым
        int temp;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для проверки:");
        // считывает число
        int num = scan.nextInt();
        // проверяем число на простоту
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        // если переменная isPrime равна true, то число простое
        if (isPrime) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - составное число");
        }
    }
}
