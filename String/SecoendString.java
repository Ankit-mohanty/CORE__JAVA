package String;

public class SecoendString {//String are immuatable
    public static void main(String[] args) {

        String name = "Ankit";// You can not change the data you stored in string type.After some time the Ankit stored in String constant pool it was removed by garbage collecot.
        name = name + " Mohanty"; // here we are Changing the adress not the data. basically we create  new object here.
        System.out.println(name);

        String s1 = "Rahul";//here the string create an object and store rahul in string constant pool.
        String s2 = "Rahul";// Here String does not create another object to store the Same values.
        // if the value is not same then it create a object and store the value.
        System.out.println(s1 == s2);
    }
}
