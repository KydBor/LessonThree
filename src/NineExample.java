public class NineExample {
    public static void main(String[] args) {
        int t = 0;
        int u = 1;
        int y;
        System.out.print(t + " " + u + " ");
        for (int i = 3; i <= 20; i++) {
            y = t + u;
            System.out.print(y + " ");
            t = u;
            u = y;
        }
    }
}
