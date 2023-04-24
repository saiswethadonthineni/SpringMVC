
class Rectangle{
    int l, b;

    double calculateLength(int l, int b) {
        this.l = l;
        this.b = b;

        return l * b;
    }
}
    class Perimeter extends Rectangle {
        double peri() {
            return 2 * (l + b);
        }
    }
    public class InheritanceEx {
        public static void main(String args[]) {
            Perimeter p = new Perimeter();
            p.calculateLength(5, 6);
            System.out.println(p.peri());


        }
    }



