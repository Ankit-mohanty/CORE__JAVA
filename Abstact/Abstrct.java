package Abstact;

abstract class Car {// we can decale abstact method inside the abstact class only.
    public abstract void drive();// we are bound to define this abstact method in the extended class
//        System.out.println("I am driving the car");

    public void music() {
        System.out.println("Playing music in the car");
    }
}

class BMW extends Car {
    @Override
    public void drive() {
        System.out.println("Driving........");
    }
}

public class Abstrct {

    public static void main(String[] args) {

//      Car obj = new Car();// we can create the object of an absract class
        Car obj = new BMW();
        obj.drive();
        obj.music();
    }
}
