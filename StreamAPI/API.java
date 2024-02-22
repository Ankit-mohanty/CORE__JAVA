package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class API {
    public static void main(String[] args) {
        List<Integer> ll = Arrays.asList(4, 5, 7, 6, 1);

        //Write This One Line
       /* Stream<Integer> s1 = ll.stream();// it work only once
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);// it work only once
        Stream<Integer> s3 = s2.map(n -> n * 2);// it work only once
        int reselu = s3.reduce(0, (c, e) -> c + e);*/

     /* int reselu=  ll.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);// c,e =carry and element*/
        Stream<Integer> ss=ll.parallelStream()//do not use paralla stream during shorting.
                .filter(n -> n % 2 == 0);
//                .sorted();
//        s1.forEach(n-> System.out.println(n));
//        s2.forEach(n -> System.out.println(n));
//        System.out.println(reselu);
ss.forEach(n-> System.out.println(n));
        //        for (int i = 0; i < ll.size(); i++) {
//            System.out.println(ll.get(i));
//        Consumer<Integer> com= n->{
//            System.out.println(n);
//        };
//        ll.forEach(com);
//        ll.forEach(n->System.out.println(n));
    }

    //int sum=0;
//        for (int n : ll) {
//            if (n % 2 == 0) {
//                n = n * 2;
//                sum = sum + n;
//            }
//        }

}

