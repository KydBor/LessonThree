public class FourExemple {
    public static void main(String[] args) {
        int a = 2;
        int b = -1;
        int c = 0;
        for ( ; b > 0 || b <= -1 ; b--, c += a) {
        }System.out.println(c);

        int q = -4;
        int w = -1;
        int e = 0;
        while(w <= -1 || w > 0) {
            w--;
            e += q;
        } System.out.println(e);

        int z = -5;
        int x = -1;
        int v = 0;
        do {
            x--;
            v += z;
        } while (x <= -1 || x > 0);
        System.out.println(v);
    }
}
