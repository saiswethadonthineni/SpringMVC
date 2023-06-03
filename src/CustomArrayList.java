import java.util.ArrayList;
import java.util.List;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        System.out.println("hi");
        if(this.contains(o)){
            return true;
        }
        return super.add(o);
    }

    public static void main(String[] args) {

        CustomArrayList li = new CustomArrayList();
        li.add(1);
        li.add(1);
        li.add(2);
        li.add(3);
        System.out.println(li);

    }
}
