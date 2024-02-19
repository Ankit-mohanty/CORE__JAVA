package StaticKeyWord;

class Mobile {
    static String name;// it common for all the object// It is a class memeber not a object member
    String brand;
    int price;

    public void show() {// Here we write the method to print the value
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class KeyWOrdStatic {
    public static void main(String[] args) {

        Mobile mob1 = new Mobile();
        mob1.brand = "Apple";
        mob1.price = 120000;
        Mobile.name = "Iphone15Pro";

        Mobile mob2 = new Mobile();
        mob2.brand = "Samsung";
        mob2.price = 15255;
        Mobile.name = "S24Ultra";
        Mobile.name = "Phone";//Static variable should be call by the help of class name.
// We have to call this like because if someone read the code they can  understand is name is common for every one
        mob1.show();
        mob2.show();
    }


}
