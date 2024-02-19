package Encapsulations;

class Human {
    //    private int age = 12; // thhis is accseable in same class only
    private int age; // thhis is accseable in same class only
    //    private String name = "Ankit";// we can call this value by creating method in same class.
    private String name;// we can call this value by creating method in same class.

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {//Here we decalre "a" to accepting the value
        age = a;// Here we asign the value to age.
    }

    public void setName(String n) {
        name = n;
    }

}

public class JavaEncap {
    public static void main(String[] args) {

        Human obj = new Human();
//        obj.name="Ankit";
//        obj.age=12;

        obj.setName("Ankit Mohanty");// here we set value usig setname
        obj.setAge(12);

        System.out.println(obj.getName() + " : " + obj.getAge()); //here we retrive the valus use get name
    }
}
