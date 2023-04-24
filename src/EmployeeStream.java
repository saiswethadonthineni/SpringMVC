import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    int age;
    String name;
    int salary;
    String dept;

    public Employee() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(int age, String name, int salary, String dept) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}




public class EmployeeStream {
    public static void main(String[] args){
        List<Employee> em = new ArrayList<>();
        em.add(new Employee(21,"sai",5000, "A"));
        em.add(new Employee(22,"swetha",10000, "B"));
        em.add(new Employee(23,"venky",12000,"A"));
        em.add(new Employee(24,"rao",13000, "B"));
        em.add(new Employee(25,"shreya",4000,"C"));
        em.add(new Employee(26,"vasv",15000,"A"));
        //em.stream().filter(n->n.name.startsWith("v")).forEach(n->System.out.println(n.name));
        //em.stream().filter(n->n.salary>5000).forEach(System.out::println);
       // em.stream().filter(n->n.salary<5000 && n.name.endsWith("a")).forEach(System.out::println);
//dont want first three records
        //only first two records
        //sum of the salaries

//        System.out.println(em.get(3));
        //System.out.println(em.get(2));
//em.stream().map((n1,n2)->n1+n2);
//        em.stream().skip(3).forEach(System.out::println);
//        em.stream().limit(2).forEach(System.out::println);
//        IntSummaryStatistics s= em.stream().collect(Collectors.summarizingInt(e->e.salary));

       Map<String,List<Employee>> h = em.stream().collect(Collectors.groupingBy(e->e.getDept()));//.entrySet().stream().forEach(e-> System.out.println(e.getKey()+"   "+e.getValue()));

        List<String> l= new ArrayList<>();
        l.add("venky1");
        l.add("venky");
        l.add("vky3");
        l.add("venky4");
        l.add("vey5");
        Map<String,Integer> i = l.stream().collect(Collectors.toMap(e->e,e->e.length()));
        for (Map.Entry<String, Integer> g: i.entrySet()) {
            System.out.println(g);
        }
//        for(String s:l){
//            System.out.println(s);
//        }
//        h.keySet()
       /* for(Map.Entry<String, List<Employee>> j:h.entrySet()){
            System.out.println(j);
        }
*/
        //count of the employees whos name starts with v and age is even number
       /*Long c = em.stream().filter(n->n.name.endsWith("v") && n.age %2==0).count();
        System.out.println(c);*/

        //employee whose salary is highest
      /* Optional<Employee> e = em.stream().max((n1, n2)->n1.salary>n2.salary?1:-1);
        System.out.println(e);*/

        //employee whos names conatins 3 letters you want to print them as the list.
      /* List<Employee> p = em.stream().filter(n->n.name.length()==3).collect(Collectors.toList());
        System.out.println(p);*/

//        em.stream().map(n->n.name).sorted().forEach(System.out::println);
//       Stream.iterate(3, i -> i+3).limit(10).forEach(System.out::println);

    }
}
