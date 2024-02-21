package Threads;

//class A extends Thread{
/*class A implements Runnable{
   public void run(){
        for (int i = 1; i <=100 ; i++)
        System.out.println("HUiiii");
       try {
           Thread.sleep(10);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
}
//class B extends Thread{
class B implements Runnable{//another style to create thread
   public void run(){
        for (int i = 1; i <=100 ; i++) {
            System.out.println("HELOO........");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}*/
public class Threads {
    public static void main(String[] args) {
        Runnable obj1=()-> {
            for (int i = 1; i <=100 ; i++) {
                System.out.println("HELOO........");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable obj2=()-> {
            for (int i = 1; i <=100 ; i++) {
                System.out.println("Hiiiiiii........");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t2.start();
        t1.start();
/*A obj1=new A();
B obj2=new B();
//obj1.start();
        Thread t1=new Thread(obj1);

//        System.out.println(obj1.getPriority()); */
    }
}
