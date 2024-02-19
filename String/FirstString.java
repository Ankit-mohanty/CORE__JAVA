package String;

public class FirstString {
    public static void main(String[] args) {

        //String name="Rahul";// here the object is created automatically by java

        String name = new String("Ankit Mohanty");// here we create a string  object.

        System.out.println("Hello " + name);// Here we use plus symbol to concatinate the hello with the value of name.
        // If you want to givw space between the name and hhole you have to define with hello in same semi-colon.
        System.out.println(name.hashCode());
        System.out.println(name.charAt(1));// here we find the charecter present int indexnumber 1.
        System.out.println(name.concat(" Rahul"));// here we cancat the Ankit with rahul.
    }
}
