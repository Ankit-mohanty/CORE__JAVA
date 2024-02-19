package Casting;

class A {
    public void show() {
        System.out.println("In A");
    }
}

class C extends A {
    public void show1() {
        System.out.println("In  B");
    }
}


public class Casting {
    public static void main(String[] args) {

        A obj = (A) new C();// this is called up casting
        obj.show();
        C obj1=(C) obj;
        obj1.show1();
    }
}


