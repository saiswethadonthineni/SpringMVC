public class First {
    public static void main(String[] args) {
        int i=1;
        int j=1;
      while(i<=5){
          while (j<=10){
              System.out.println(i+"*"+j+"="+i*j);
              j++;
          }
          j=1;
          i++;
      }
    }
}
