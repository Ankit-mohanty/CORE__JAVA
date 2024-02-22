package Threads;
class Counter{
    int count;
    public synchronized void increment(){//we use syncronised key word to safe form race condition.
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c= new Counter();

        Runnable obj1=()->{
            for (int i = 0; i <=10000 ; i++) {
c.increment();
            }
        };
        Runnable obj2=()->{
            for (int i = 0; i <=10000 ; i++) {
c.increment();
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();//method allows
        t2.join();
        System.out.println(c.count);
    }
}
