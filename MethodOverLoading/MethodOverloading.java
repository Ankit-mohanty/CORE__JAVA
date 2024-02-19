class Calculator {

    //    public int addThreeNum(int n1, int n2, int n3) {
    public int add(int n1, int n2, int n3) {// We can make methods of same name but different para meters and also different types.

        return n1 + n2 + n3;
    }

    //    public int addTwoNumbers(int n1, int n2) {
    public int addTwoNumbers(int n1, int n2) {// this concept is called method overloading.
        int result = n1 + n2;
        return result;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {

        Calculator cal = new Calculator();

//        int r2 = cal.addThreeNum(1, 2, 3);
//        System.out.println(r2);

        int r1 = cal.add(2, 3, 5);
        System.out.println(r1);
    }
}
