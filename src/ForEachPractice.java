import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachPractice {
    public static void main(String[] args){
        ArrayList<Integer> s = new ArrayList<>();
        s.add(15);
        s.add(3);
        s.add(20);
        s.add(20);
        s.add(31);
        s.add(35);
        //s.forEach(n-> System.out.println(n));
        /*for (int n:s) {
            System.out.println(n);

        }*/
        /*for(int i =0;i<s.size();i++){
            System.out.println(s.get(i));
        }*/
        //Collections.sort(s);
        Set<Integer> a= s.stream().filter(n->n%5==0).map(n->n+5).collect(Collectors.toSet());
        System.out.println(a);
    }
}
