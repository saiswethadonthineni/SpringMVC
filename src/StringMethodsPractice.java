public class StringMethodsPractice {

    public static void main(String[] args) {


        String s = "aeiou sai";
        int count =0;
        for (int i = 0; i <= s.length()-1;i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e' ||s.charAt(i)=='i'||s.charAt(i)=='o' ||s.charAt(i)=='u') {
                count++;

            }
        }
        System.out.println("vowel count is"+count);

    }
}
