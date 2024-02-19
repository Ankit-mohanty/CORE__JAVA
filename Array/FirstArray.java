package Array;

public class FirstArray {// store same type of multiple data in a single variable.

    public static void main(String[] args) {

        // int num[]={3,7,5,6};// declare an array.
        //num[2]=8; // This how using the index value of an array we can change the value of an array.

        /*int number[] = new int[5];// Here we dynamically declare an array
        number[0] = 10;// If we do not asign the value ,the value is 0
        number[1] = 9;
        number[2] = 8;
        number[3] = 7;
        number[4] = 6;

        for (int i = 0; i <= number.length; i++) {//Here we use length method to find the size of array.
            System.out.println(i);
        }*/

        int[][] nums = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] n : nums) {// enhance for loope
            for (int m : n) {
                System.out.println(m + " ");
            }
            System.out.println();
        }
        /* System.out.println(number[0]);// here we get the  particular data by using index values of an array.
        //System.out.println(number[2]);// here we get the  particular data by using index values of an array.*/
    }
}
