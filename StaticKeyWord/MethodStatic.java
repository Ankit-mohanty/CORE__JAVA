package StaticKeyWord;

class Ankit {
    static String name;
    String brand;
    int price;

    public static void show1(Ankit ph) {
        System.out.println("In static method");
        System.out.println(name + " : " + ph.brand + " : " + ph.price);// we can only use static variable inside it. we can not use non-static variable inside it.
    // by the using of object referance we can call non-static variable in side the static method
    }


    public void show() {
        System.out.println(name + " : " + brand + " : " + price);
    }
}

public class MethodStatic {
    public static void main(String[] args) {
        Ankit ph = new Ankit();
        Phones.name = "Iphone";
        ph.brand = "Apple";
        ph.price = 121212;
        ph.show();// show is a non-static method that's why we need  object to call this method.

        Ankit.show1(ph);// We  call static method by using class name.
    }
}
