package ThisKeyWord;

class A {// A is Super class

    public A() {
        super();
        System.out.println("in A");
    }

    public A(int num) {
        super();
        System.out.println("In A Is Int");
    }
}

class B extends A {
    public B() {
//        super();
        super(5);//here we call B class default constuctor and A class parameterized construcor.
        System.out.println("In B");
    }

    public B(int n) {
//        super(); // it is call the default constructor of SUPER class (A).
        //super(n);// for calling the super calss parameterized constuctor we hava to pass the parameter in super keyword
        this();// call the same class of same calss
        System.out.println("In B Int");
    }

}

public class ThisandSuper {
    public static void main(String[] args) {
        B obj = new B();// here it call the default constructor.
        B obj1 = new B(5);// here we pass the para meter  the b call the parameterized constuctor.
    }
}
