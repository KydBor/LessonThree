import java.util.Scanner;

public class TenExemple {
    public static void main(String[] args) {
//10.Выведите на экран все положительные делители натурального числа
        int n;
        int m = 0;
        System.out.print("Вводите ваше натуральное число - ");
        Scanner sr = new Scanner(System.in);
        n = sr.nextInt();
        System.out.print("Число " + n + " делится на - " );
        for(int i = 1; i <= n; i++){
            if ((n % i) == 0){
                m++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Количество делителей - " + m);

    }
}
