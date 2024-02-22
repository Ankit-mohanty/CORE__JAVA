package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {// here key can not be repeated but vales are repeated.
//        Map<String,Integer>  students=new HashMap<>();
        Map<String,Integer>  students=new Hashtable<>();//if you work in multiple threads you have to use hashtable becaues it is syncronised.

        students.put("Rahul",1);
        students.put("Ankit",2);
        students.put("Mohanty",3);
        students.put("Gyam",4);
        students.put("Gyam",5);

//        System.out.println(students);
        for (String key: students.keySet())
            System.out.println(key+" : "+students.get(key));
    }
}
