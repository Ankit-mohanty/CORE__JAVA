package StaticKeyWord;

class Phones {
    static String name;

    static {// It is use to Intialise the static variabale.Static block runs only once. Because it is a class member not object.
        // Class load only once by class loader that's why static block loads only once.
        name = "Smart Phone";
        System.out.println("In the Static block");
    }

    int price;
    String brand;

    public Phones() {//Constuctor
        brand = "";
        price = 2000;
        System.out.println("In the constuctor");
    }

    public void show() {
        System.out.println(name + " : " + brand + " : " + price);
    }
}

public class StaticBlock {
    //    public static void main(String[] args) throws ClassNotFoundException {
    public static void main(String[] args) {
//      Class.forName("StaticKeyWord.Phones");// By using this we can load a class without using Object.

//        Phones ph=new Phones();
//        Phones.name="Iphone";
//        ph.brand="Apple";
//        ph.price=121212;
//        ph.show();
//        Phones ph2=new Phones();
    }
}
