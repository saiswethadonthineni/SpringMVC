class Random {
    String s;

    void n(String s) {
        this.s = s;
        System.out.println("hello" + s);
    }
}
public class MethodsPractice {
    int x;
    void m() {
        System.out.println("Hello");
    }

    void z(int x) {
        this.x =x;
        System.out.println("x value is....." + x);
    }

    public static void main(String[] args) {
        MethodsPractice mp = new MethodsPractice();
        mp.m();
        mp.z(8);
        Random r = new Random();
        r.n("  venky");

    }
}








