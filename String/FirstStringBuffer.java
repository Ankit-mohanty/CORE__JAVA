package String;

public class FirstStringBuffer {//It is mutable. Means we can chage the data.

    public static void main(String[] args) {

        StringBuffer ab = new StringBuffer("Ankit");// by using toString method we can convert the string buffer to String

        ab.append("Mohanty"); // by using append i can cancat mohanty with ankit

        ab.deleteCharAt(1);// here we can delete a character by using the index number
ab.insert(1,"N");// herer we insert the value
        ab.setLength(30); // here we set the length of string buffer
        ab.ensureCapacity(100);
//        System.out.println(ab.capacity());//The capacity of string buffer is 16
//        System.out.println(ab); //after this string buffer size is 21. Because to the reduce of relocation.
//        System.out.println(ab.length());
        System.out.println(ab);

    }
}
