public class ThreeExemple {
    public static void main(String[] args) {
//Вычислить: 1+2+4+8+…+256
        int k = 0;
        for(int i = 1; i <= 256; i *= 2) {
            k += i;
        } System.out.println(k);

        int p = 1;
        int o = 1;
        while(o < 256) {
            o *= 2;
            p += o;
        } System.out.println(p);

        int w = 1;
        int q = 1;
        do {
            q = q * 2;
            w += q;
        } while (q < 256);
        System.out.println(w);
    }
}
