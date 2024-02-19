class Computer {
    public void playMusic() {// if we use "VOID" that means this method not given any return.
        System.out.println("Play Music");
    }

    public String getPen(int cost) {// What ever type ypu return here ypu have to mention that ex:- String.
        if (cost >= 10)
            return "pen";

        return "nothing";
    }
}

public class Demo {

    public static void main(String[] args) {

        Computers com = new Computers();
        com.playMusic();

        String str = com.getPen(0);
        System.out.println(str);
    }
}
