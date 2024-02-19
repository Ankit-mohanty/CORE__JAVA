package ThisKeyWord;
class OBj{
    public OBj(){
        System.out.println("I am here");
    }
    public void show(){
        System.out.println("I am Showing");
    }

}
public class AnnonymousObject {
    public static void main(String[] args) {
            new OBj().show();// Annonymous Object= Only problem in it is we can not reuse this object.
    }
}
