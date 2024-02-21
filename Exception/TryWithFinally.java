package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinally {
    public static void main(String[] args) throws IOException {
        int nums=0;
//        BufferedReader bf = null;
        System.out.println("Enter the number");
        try(BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))){
            /*Bufferreaders are autocloable .instead of use close methos if directly pass into the try block after
            doing his wrok it is automatically closed.*/
             nums=Integer.parseInt(bf.readLine());
            System.out.println(nums);
        }
      /*  try{
//            InputStreamReader ir=new InputStreamReader(System.in);
            bf=new BufferedReader(new InputStreamReader(System.in));
            nums=Integer.parseInt(bf.readLine());
            System.out.println(nums);
        }
        finally {// we are use to close the resource.
            bf.close();
        }*/
        /*int i=0;
        int j=0;
        try{
            j=18/i;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {//We know that if the exception occur  the next line not executed so that's why we use finally block.
            // It usages because is the exception occurs or not this block will be print. We can use try with finally.
            System.out.println("Rahul");
        }*/

    }
}
