package InputFormUser;

import java.io.IOException;

public class TakeInputFormUser {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
       int num= System.in.read();
        System.out.println(num-48);// here we did it because this inputstream methood print the
        // ASCII(American Standard Code for Information Interchange) vale of number. It aslo
        //reads one charecter at a time.

    }
}
