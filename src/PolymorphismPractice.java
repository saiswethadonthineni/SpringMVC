class Parent{
    static final int b;
    final int a;

    static {
        b= 10;
    }

    Parent(){
        a =6;
        System.out.println("Nani");
    }

    void m(){
        System.out.println("Hello Hi");
    }
}
class Child extends Parent{

    Child(){
        super();
    }
    void n(){
        System.out.println("hello Sai"+a);
        //System.out.println(super.a);
        super.m();

    }
}
public class PolymorphismPractice {
    public static void main(String[] args) {
        Child p = new Child();
        p.n();
    }
}
