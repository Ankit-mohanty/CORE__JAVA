package Annotaions;
class A{
    public  void show(){
        System.out.println("Showing");
    }
}
class B extends A{
    @Override// we are using this to show the error during compile time.
//    public void shows()
    public void show() {
        System.out.println("Adding.....");
    }
}
public class Anotation {
    public static void main(String[] args) {

        B o=new B();
        o.show();
    }
}
