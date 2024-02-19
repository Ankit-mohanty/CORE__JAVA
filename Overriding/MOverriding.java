package Overriding;

class A {

    public void show() {// same method
        System.out.println("In A show");
    }

    public void config() {
        System.out.println("A is config");
    }
}

class B extends A {
    public void show() {// same method
        System.out.println("In B show");
    }
}

public class MOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.show();// priority give to own class method. this is called method overrideing.
    }
}
