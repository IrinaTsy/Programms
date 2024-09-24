package setCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTests {

    public static void main(String[] Args){

 //                     Set - отсеивают все одинаковые объекты
 //          |                       |
//         HashSet              TreeSet
//           |
//      LinkedHashSet

        String s1 = "kiwi";
        System.out.println(s1.hashCode());
        String s6 = new String("kiwi");
        System.out.println(s6.hashCode());


        String s2 = "apple";
        System.out.println(s2.hashCode());
        String s3 = "banana";
        System.out.println(s3.hashCode());
        String s4 = "orange";
        System.out.println(s4.hashCode());
        String s5 = "grape";
        System.out.println(s5.hashCode());

        HashSet<String> set = new HashSet<String>();//произвольный порядок

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);

        System.out.println(set);

        LinkedHashSet<String> set1 = new LinkedHashSet<String>();//в порядке добавления

        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        set1.add(s4);
        set1.add(s5);
        set1.add(s6);

        System.out.println(set1);

        TreeSet<String> set2 = new TreeSet<String>();//в алфавитном порядке

        set2.add(s1);
        set2.add(s2);
        set2.add(s3);
        set2.add(s4);
        set2.add(s5);
        set2.add(s6);

        System.out.println(set2);
    }
}
