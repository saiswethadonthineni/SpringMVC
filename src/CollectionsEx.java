import java.util.*;


public class CollectionsEx {

    public static void main(String[] args){
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 0;
                }
                return -1;
            }
        };
        ArrayList<Integer> al = new ArrayList<>();
        al.add(67);
        al.add(12);
        al.add(1);
        Collections.sort(al,com);
        System.out.println(al);
    }
}
