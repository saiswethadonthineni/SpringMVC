public class Factorial {
    static int b= 10;

     static void m(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

    }
    public static void main(String args[]){
     Factorial.m(5);
        System.out.println(Factorial.b);


        }
    }

