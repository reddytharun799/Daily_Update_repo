package comparablendcomparator;

import java.util.*;

public class StudentTest<K,V> {

    public static void main(String[] args) {
        Map<String,Student>comp=new TreeMap<>();
        Student student=new Student("srinu",45);
        Student student1=new Student("srikanth",78);
        Student student2=new Student("naresh",77);
        Student student3=new Student("kiran",49);
        comp.put("sai",student);
        comp.put("durga",student1);
        comp.put("madhu",student2);
        comp.put("kiranmi",student3);

        for (Map.Entry<String,Student>entry:comp.entrySet()){
            System.out.println("Key"+" " +entry.getKey()+" "+"  Value" + "  " +entry.getValue());
        }
        //===============================================================================
        //The custom comparator com is written using compare ages of Student objects.
       /* Comparator<Student> com=new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j){
                if( i.age > j.age)
                return 1;
                else
                    return -1;
                     }
             };*/
        //=========================================================================
        // Easy way write comparator our owm logic
        //The custom comparator com is written using a lambda expression to compare ages of Student objects.
        Comparator<Student> com = (i, j) -> {
            return i.age > j.age ? 1 : -1;
        };
        List<Student>list=new ArrayList<>();
        list.add(new Student("anusha",66));
        list.add(new Student("Radhika",55));
        list.add(new Student("Sahithi",83));

       Collections.sort(list,com);
        for (Student s:list)
        System.out.println(s);


    }
}
