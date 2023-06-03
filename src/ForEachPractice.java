import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class ForEachPractice implements FunctionalInterfaceEx {
    @Override
    public int a(int a1, int a2) {
        return a1 + a2;
    }

    public static void main(String[] args) {
        ForEachPractice f = new ForEachPractice();
        System.out.println(f.a(10, 12));
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
       /* Set<Integer> a= s.stream().filter(n->n%5==0).map(n->n+5).collect(Collectors.toSet());
        System.out.println(a);*/
        /*for(int a:s)
            System.out.println(a);*/
        s.forEach(n -> System.out.println(n));
       // String a = "saiswetha";
        List<String> b = new ArrayList<>();
        b.add("saiswetha");
        b.add("sai");
        b.add("saiswetha");
        Map<String, Long> collect = b.stream().collect(groupingBy(Function.identity(), counting()));
        System.out.println(collect);


    }
}
