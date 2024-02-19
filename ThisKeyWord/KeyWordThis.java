package ThisKeyWord;

class Homo {
    private String name;
    private int age;

    public Homo(String name, int age) {// Prameterized constructor
        this.name = name;
        this.age = age;
    }

    //    public Homo(int a, String n){// Prameterized constructor
//        age=a;
//        name=n;
//    }
    public Homo() {// I is a special method same name as class name does not return anything
//        System.out.println("In the constuctor");// Every time tou call the object it call the constuctor.
        age = 12;
        name = "Mia";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//    public void setAge(int age, Homo hm) {
//        Homo obj1=hm;
//        hm.age = age;
        this.age = age;// This is use to represent current object
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class KeyWordThis {
    public static void main(String[] args) {

        Homo hm = new Homo();// if we are not pass any data then by default constuctor call,
        System.out.println(hm.getName() + " : " + hm.getAge());

        Homo hm1 = new Homo("Rahul", 12);// by using parameterised constructor we can directly pass the value.
        System.out.println(hm1.getName());

//      hm.setName("Ankit Mohanty");
//      hm.setAge(12,hm);
//      hm.setAge(12);
//        System.out.println(hm.getName()+" : "+hm.getAge());
    }
}
