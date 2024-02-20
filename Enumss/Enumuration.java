package Enumss;

/*enum Status {// we are using this to fine the status of application.

    Running, Failed, Pending, Sucess;// its called named constant.
}*/
enum Laptop {
    MacBook(2000), ThinkPad();

    private Laptop() {//we create this constructor for the non parameteraised value
        price=500;
    }

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enumuration {
    public static void main(String[] args) {
        int i = 5;
//        Status s = Status.Sucess;
//        System.out.println(s.ordinal());
//        Status[] ss=Status.values();
//        for (Status s:ss) {
//            System.out.println(s);
//        }
       /* Status s = Status.Pending;
        String resuly="";
        switch (s){// new switch case
            case Failed -> System.out.println("Not working");
            case Sucess -> System.out.println("Good To Go");
            case Pending -> resuly="processing";// we can write this except this
            case Running -> System.out.println("Working... ");
            default -> System.out.println("Try Again ....");
        }
        System.out.println(resuly);*/
       /* if (s == Status.Running)
            System.out.println("All Running");
        else if (s == Status.Pending) {
            System.out.println("All Pending");

        } else if (s == Status.Sucess) {
            System.out.println("All sucess");
        } else if (s == Status.Failed) {
            System.out.println("All failed");
        }*/
        Laptop lap = Laptop.MacBook;
        Laptop.MacBook.setPrice(500);
        System.out.println(lap + " " + lap.getPrice());
        for (Laptop lap1 : Laptop.values())
            System.out.println(lap1 + " : " + lap1.getPrice());
    }
}
