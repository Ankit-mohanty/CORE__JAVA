package Lmada;

@FunctionalInterface
interface A {
    void show(int i);


}

interface B {
    void show1();
}


public class Lamada {
    public static void main(String[] args) {
        B obj1 = () -> System.out.println("I love java");
        // A obj = (int i) -> System.out.println("showinggg...");// by using lamda expression we call the functional interface.
        A obj = i -> System.out.println("Showw");// if we have one variable we can use the variable name instad of bracket.
        obj.show(52);
        obj1.show1();
    }
}
