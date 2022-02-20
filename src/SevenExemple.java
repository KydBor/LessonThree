public class SevenExemple {
    public static void main(String[] args) {
        System.out.println("Задача решена одним способом");
        int j = 0;
        for (int i = 1; i <= 99; i += 2) {
            j += i;
        } System.out.println(j);

        int u = 1;
        int y = 1;
        while(y < 99) {
            y += 2;
            u += y;
        }System.out.println(u);

        int r = 1;
        int e = 1;
        do {
            e += 2;
            r += e;
        } while (e < 99);
        System.out.println(r);
    }
}
