public class TwoExemple {
    public static void main(String[] args) {
/*Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/
        int k = 1;
        for(int i = 3; i <= 24; i += 3) {
            k = k * 2;
            System.out.println("Через " + i + " часа будет " + k + " Амёб");
        }System.out.println();

        int p = 1;
        int o = 0;
        while(o < 24) {
            o += 3;
            p = p * 2;
            System.out.println("Через " + o + " часа будет " + p + " Амёб");
        }System.out.println();

        int w = 1;
        int e = 0;
        do {
            e += 3;
            w = w * 2;
            System.out.println("Через " + e + " часа будет " + w + " Амёб");
        } while (e < 24);
    }
}
