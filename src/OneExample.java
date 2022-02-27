public class OneExample {
    public static void main(String[] args) {
/* Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней? */
        double t = 10;
        double k = 10.0;
        for(int i = 1; i < 7; i++) {
            k = k * 1.1;
            t += k;
        } System.out.println(t);

        double p = 10.0;
        double o = 10.0;
        int l = 1;
        while (l < 7) {
            l++;
            o = o * 1.1;
            p += o;
        } System.out.println(p);

        double w = 10.0;
        double e = 10.0;
        int q = 1;
        do {
            q++;
            e = e * 1.1;
            w += e;
        } while (q < 7);
        System.out.println(w);

    }
}
