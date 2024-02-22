package Collection;

import java.util.*;

public class Collectionsss {
    public static void main(String[] args) {
//        List<Integer> col = new ArrayList<Integer>();//we are using generics to define the dat type of collection.
//        Set<Integer> col = new HashSet<Integer>();//set does not support index vlaues.
        Set<Integer> col = new TreeSet<Integer>();// tree set get dat in shorted order.
        col.add(8);// these values are by default are object type.
        col.add(2);
        col.add(3);
//        System.out.println(col.get(2));// retive the data by using index value.
//        System.out.println(col.indexOf(8));// get the value of index
//
        Iterator<Integer> values= col.iterator();// itarator basically use to retrive the data
        while (values.hasNext())
            System.out.println(values.next());
    }
}