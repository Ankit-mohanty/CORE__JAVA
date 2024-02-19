package ObjectClass;

import java.util.Objects;

class Laptop {
    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

//    public String toString() {
//        return model + " ; " + price;
//    }

   /* public boolean equals(Laptop lap) {
//        if (this.model.equals(lap.model) && this.price == lap.price) {
//            return true;
//        } else {
//            return false;
//        }
        return this.model.equals(lap.model) && this.price == lap.price;
    }*/
}

public class ObjectClasss {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Apple MacBoook";
        obj.price = 120000;

        Laptop obj2 = new Laptop();
        obj2.model = "Apple MacBoook";
        obj2.price = 120000;
        boolean result = obj.equals(obj2);// it returns false because equlas method does not check the value it checks
        // the hashcode vale of the object.
        System.out.println(result);// Every time we call this the object call tostring method.
        // it returns  classname and @ symbol and hexString(hashcode);
        System.out.println(obj);
        System.out.println(obj2);
    }
}
