package Array;

public class ForEachLoope {
    public static void main(String[] args) {
        int num[] = new int[6];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
//        int n = num.length;
//        for (int i = 0; i < 6; i++) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(num[i]);
//        }
//        System.out.println();
//
//    }
        for (int n : num) {// It is also call enhanced for loop.
            System.out.println(n);
        }
    }
}
