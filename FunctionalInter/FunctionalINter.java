package FunctionalInter;

@FunctionalInterface// after put this we can not define any other method in it
interface A {//this is called functional interface but it's better to identify.

    void show();
}

/*class B implements A {

    @Override
    public void show() {
        System.out.println("showing");
    }
}*/
public class FunctionalINter {// functional inerface means only one method in the interface.

    public static void main(String[] args) {
        A obj = new A() {//Annonymous innnerclass
            @Override
            public void show() {
                System.out.println("showing.......");
            }

        };
    obj.show();
    }

}
