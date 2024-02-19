package InnerClass;
class D{
    public void show(){
        System.out.println(" D Showing......");
    }
}
/*class E extends D{
    public void show(){
        System.out.println("E Showing");
    }
}*/
public class AnnonymousInnnerclass {
    public static void main(String[] args) {
        D rahul=new D(){

            public void show() {
                System.out.println("Showing..........");// this is called annonymous inner class .
            }// Basically annonumous innerclass is class define by JVM.
        };
    rahul.show();
    }

}
