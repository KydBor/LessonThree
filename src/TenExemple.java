import java.util.Scanner;

public class TenExemple {
    public static void main(String[] args) {
//10.Выведите на экран все положительные делители натурального числа
        int n;
        int count = 0;
        System.out.print("Вводите ваше натуральное число - ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        System.out.print("Число " + n + " делится на - " );
        for(int i = 1; i <= n; i++){
            if ((n % i) == 0){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Количество делителей - " + count);










/*11.Определить, является ли число простым
            int temp;
            boolean isPrime=true;
            Scanner scan= new Scanner(System.in);
            System.out.println("Введите число для проверки:");
            // считывает число
            int num=scan.nextInt();
            // проверяем число на простоту
            for (int i=2; i<=num/2; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            // если переменная isPrime равна true, то число простое
            if(isPrime) {
                System.out.println(num + " - простое число");
            } else {
                System.out.println(num + " - составное число");
            }*/
    }
}
