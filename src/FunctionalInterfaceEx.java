
@FunctionalInterface
public interface FunctionalInterfaceEx {
    int a(int a1, int a2);


    default Double add(double a, double b){
        return a+b;
    }
    static String name(){
        return "Sai";
    }



}
