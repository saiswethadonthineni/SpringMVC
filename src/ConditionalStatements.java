import java.util.Scanner;

class Calc {
    public int add(int a1, int b1) {
        return a1 + b1;
    }

    public int add(int a1, int b1, int c1) {
        return a1 + b1 + c1;
    }

    public int sub(int a1, int b1) {
        return a1 - b1;

    }

    public float div(int a1, int b1) {
        return a1 / b1;
    }


}

public class ConditionalStatements {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        Calc obj = new Calc();
        int ch;
        do {
            System.out.println("Enter the operation you want to perform1.addition\n2.subtraction\n3.divison4.exit\n");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("do you want 2 number addition or 3 number addition enter");
                    int temp = sc.nextInt();
                    int res=0;
                    System.out.println("enter the numbers");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    if(temp==3){
                        c = sc.nextInt();
                        res = obj.add(a, b, c);
                    }
                    else{
                        res= obj.add(a,b);
                    }


                    System.out.println(res);

                    break;
                case 2:
                    System.out.println("enter two numbers");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    res = obj.sub(a, b);
                    System.out.println(res);
                    break;
                case 3:
                    System.out.println("enter two numbers:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    float res1 = obj.div(a, b);
                    System.out.println(res1);
                    break;
                case 4:
                    System.out.println("bye...");
                    break;
            }

        } while (ch <= 4);


    }

}
