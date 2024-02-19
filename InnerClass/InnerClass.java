package InnerClass;

class A {
    int age;

    public void show() {
        System.out.println("Show...............");
    }

    static class B {// Static can only for inner class.
        public void config() {
            System.out.println("Config............");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

//      A.B obj2 = obj.new B();// by using the object of we can create the object of the B.
        A.B obj2 = new A.B();// This is work when the B is static class
        obj2.config();

    }
}
