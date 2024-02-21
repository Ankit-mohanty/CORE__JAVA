package Lmada;

@FunctionalInterface
interface A {
    void show(int i);


}

@FunctionalInterface
interface B {
    void show1();
}

@FunctionalInterface                     //(for line transfter =Ctrl+shift+arrowbutton)
interface C {
    int add(int i, int j);
}

public class Lamada {
    public static void main(String[] args) {

        // A obj = (int i) -> System.out.println("showinggg...");// by using lamda expression we call the functional interface.
        A obj = i -> System.out.println("Showw");// if we have one variable we can use the variable name instad of bracket.
        B obj1 = () -> System.out.println("I love java");//
        C obj2 = (i,j) -> i + j;// here we print multiple parameter method

        System.out.println(obj2.add(5, 5));
        obj.show(52);
        obj1.show1();
    }
}
