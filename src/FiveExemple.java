public class FiveExemple {
    public static void main(String[] args) {
/*Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см */
        double i, j;
        for (i = 1; i <= 20; i++) {
            j = i * 2.54;
            System.out.println(i + " дюйм равен " + j + " см");
        }System.out.println();

        double q = 0.0;
        double w;
        while(q < 20) {
            q++;
            w = q * 2.54;
            System.out.println(q + " дюйм равен " + w + " см");
        }System.out.println();

        double z = 0.0;
        double x;
        do {
            z++;
            x = z * 2.54;
            System.out.println(z + " дюйм равен " + x + " см");
        } while (z < 20);
    }
}
