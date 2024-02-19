package Abstact;

abstract class Car {// we can decale abstact method inside the abstact class only.
    public abstract void drive();// we are bound to define this abstact method in the extended class
//        System.out.println("I am driving the car");
public abstract void fly();
    public void music() {
        System.out.println("Playing music in the car");
    }
}

//class BMW extends Car {
//    @Override
//    public void drive() {
//        System.out.println("Driving........");
//    }
//}

public class Abstrct {

    public static void main(String[] args) {

//      Car obj = new Car();// we can create the object of an absract class
        Car obj = new Car(){// we can define abstact method by useing annonimus inner class.
            public void drive() {// as per rules we can not create the object of abstact class, buut here we are not creating the object of absract class
                //here we are create the object of the annonymous innner class.
        System.out.println("Driving........");
    }

            @Override
            public void fly() {// we can define multiple abstact  method in this annonymous class.
                System.out.println("Flyingg...");
            }
        };
        obj.drive();
        obj.music();
    }
}
