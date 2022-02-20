public class FiveExemple {
    public static void main(String[] args) {
        double i, j;
        for (i = 1; i <= 20; i++) {
            j = i * 2.54;
            System.out.println(i + " дюйм равен " + j + " см");
        }

        double q = 0.0;
        double w;
        while(q < 20) {
            q++;
            w = q * 2.54;
            System.out.println(q + " дюйм равен " + w + " см");
        }

        double z = 0.0;
        double x;
        do {
            z++;
            x = z * 2.54;
            System.out.println(z + " дюйм равен " + x + " см");
        } while (z < 20);
    }
}
