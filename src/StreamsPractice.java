import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Details {
    String name;
    String city;
    float salary;

    public Details(String name, String city, float salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }
}
public class StreamsPractice {
    public static void main(String[] args){
        List<Details> sp = new ArrayList<Details>();
        sp.add(new Details("sai","hyd",8000f));
        sp.add(new Details("swetha","usa",9000f));
        sp.add(new Details("rao","uk",10300f));
        sp.add(new Details("rao","uk",10800f));
       /* List<Float> ab = sp.stream().filter(n->n.name=="rao")
                          .map(n->n.salary)
                          .collect(Collectors.toList());
        System.out.println(ab);*/
       // sp.stream().filter(n->n.city=="uk").forEach(n->System.out.println(n.name+" "+n.salary));
      // float tp = sp.stream().map(p->p.salary).reduce(0.0f,Float::sum);
        Details totalPrice2 = sp.stream()
                .min((p1,p2)-> p1.salary> p2.salary?1:-1).get();
               /* .map(product->product.salary)
                .reduce(0.0f,Float::sum);// accumulating price, by referring method of Float class*/
        System.out.println(totalPrice2.name);

    }


}
