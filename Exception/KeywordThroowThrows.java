package Exception;

/*class AnkitException extends Exception{
    public AnkitException(String message) {
        super(message);
    }
}*/
class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Caln");
    }
}

public class KeywordThroowThrows {


    //    public static void main(String[] args) throws ClassNotFoundException {// we can handel this in main method.But it is not a good parctice.
    public static void main(String[] args) {

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
        /*int i=20;
        int j=0;
        try{
            j=20/i;
            if (j==1)
                throw new AnkitException ("I make this");//we can print the message in it.
        }catch (AnkitException ae){
            ae.printStackTrace();
        }
        System.out.println(j);*/
}
}
