import org.w3c.dom.ls.LSOutput;

class Calculate { // another class
    int a;

    public int add(int n1, int n2) { // create method
        int r = n1 + n2;
        return r;
    }
}

public class Add {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 5;

        Calculate cal = new Calculate();// Here we create a object of calculater class.
        int result = cal.add(num1,num2);// here we call calculator class add method.

//      int result = num1 + num2;
        System.out.println(result);
    }
}
