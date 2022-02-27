public class NineExample {
    public static void main(String[] args) {
//Реализация числа Фибоначчи
        int t = 0;
        int u = 1;
        int y;
        System.out.print(t + " " + u + " ");
        for (int i = 1; i <= 20; i++) {
            y = t + u;
            System.out.print(y + " ");
            t = u;
            u = y;
        }System.out.println();

        int z = 0;
        int x = 1;
        int v = 1;
        int c;
        System.out.print(z + " " + x + " ");
        while(v <= 20) {
            v++;
            c = z + x;
            System.out.print(c + " ");
            z = x;
            x = c;
        }System.out.println();

        int q = 0;
        int w = 1;
        int e = 1;
        int r;
        System.out.print(q + " " + w + " ");
        do {
            e++;
            r = q + w;
            System.out.print(r + " ");
            q = w;
            w = r;
        } while(e <= 20);
    }
}
