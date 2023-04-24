public class ExceptionEx {

    static void m(){
        try{
            int a[] = new int[5];
            System.out.println(a[6]);
           // throw new ArrayIndexOutOfBoundsException();

        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args){
      ExceptionEx.m();
        try{
            int a =10;
            int b= 0;
            System.out.println(a/b);
        }
        catch (ArithmeticException a){
            System.out.println(a);

        }
        finally {
            System.out.println("this has to be printed");
        }
        System.out.println("hey ");
    }
}
