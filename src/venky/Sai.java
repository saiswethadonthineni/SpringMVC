package  venky;
class E{
    void b(){
        System.out.println("inside parent b method");
    }
    void a(){
        System.out.println("inside parent a method");
    }
}
class F extends  E{
    void b(){
        System.out.println("inside child b method");
    }
    void d(){
        System.out.println("inside child d method");
    }
}




public class Sai {
    public static void main(String[] args){
        F f1=new F();
        E e1= new E();
        E e2= new F();
        System.out.println("Child methods");
        f1.b();
        f1.d();
        f1.a();
        System.out.println("parent methods");
        e1.b();
        e1.a();
        System.out.println("child object parent reference");
        e2.b();
        e2.a();


    }
}
