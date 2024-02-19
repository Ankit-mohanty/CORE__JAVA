package Interface;
interface A{ // In interface by default all the classes are by default public abstarct
    int age=25;//// if we decalre a variable inside the interface we are bound ti instansiate beacuse
    //in interface every variable intreface is final and static.
    void show();
    void config();
}
interface C{
    void add();
}
class  B implements A,C{

    @Override
    public void show() {
        System.out.println("SHOW>>>>>>>......");
    }

    @Override
    public void config() {
        System.out.println("CONFIG>>>>>>>......");
    }

    @Override
    public void add() {
        System.out.println("ADING>>>>>..........");
    }
}
public class Interfacess {
    public static void main(String[] args) {
A obj=new B();
C obj1=new B();
obj.show();
obj.config();
obj1.add();
        System.out.println(A.age);
    }
}
