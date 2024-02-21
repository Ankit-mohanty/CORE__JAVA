package InputFormUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReaderrr {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your num");
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(ir);//BufferedReader needs the object of  InputStreamReader.
        //The dwarback of buffereader is it only read the string value.
        String s=bf.readLine();
        //int num=Integer.parseInt(bf.readLine());// here we use parseInt method of the Integer
        // class to convert the string into integer
        //System.out.println(num);
        System.out.println(s);
        bf.close();//it is not complusary. but it is the good practice to close it.
    }
}
