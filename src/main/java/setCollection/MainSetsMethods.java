package setCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MainSetsMethods {

    public static void main(String[] Args){

        String s1 = "kiwi";
        String s2 = "apple";
        String s3 = "banana";
        String s4 = "orange";
        String s5 = "grape";

        LinkedHashSet<String> set1 = new LinkedHashSet<String>();

        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        set1.add(s4);
        set1.add(s5);
        System.out.println(set1);

       // set1.clear(); //очистка списка

        boolean res = set1.contains("grape");//есть ли в списке объект "grape"
        System.out.println("res = " + res);

        boolean res1 = set1.contains("mango");//есть ли в списке объект "grape"
        System.out.println("res1 = " + res1);

        boolean res2 = set1.isEmpty();//проверяет пустой список или нет
        System.out.println("res2 = " + res2);

       // set1.remove("apple"); удалить объект из списка
       // System.out.println("res = " + res);

        int s = set1.size();
        System.out.println(s);

        Object[] ar = set1.toArray();//превращает список в массив (нумерует ячейки)
                                    //Object - суперкласс для всех объектов
        for (int i=0; i<ar.length; i++)
        {
            System.out.println(ar[i]+"");//распечатать массив
        }
        System.out.println();

        for (String st : set1)
        {
            System.out.print(s + " ");//распечатать коллекцию

        }
        System.out.println();


    }
}
