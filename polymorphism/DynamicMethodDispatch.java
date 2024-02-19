package polymorphism;

class A {
    public void show() {
        System.out.println("A in show");
    }
}

class B extends A {
    public void show() {
        System.out.println("B in show");
    }
}

class c extends A {
//    @Override
    public void show() {
        System.out.println("C in show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();

        obj = new B();// Here we are asign new object to old variable.
        obj.show();

        obj=new c();
        obj.show();//
    }
}
