package OptionalClass;

import java.util.Optional;

public class OptionalExmaple {
    public static void main(String[] args) {
//        String st=null;
        String st="JAVA my fevorite";
      /*  if (st == null) {
            System.out.println("This is null");
        }else {
            System.out.println(st.length());
        }*///here we are checking null by if else
        var optional= Optional.ofNullable(st);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("There is no value"));
    }
}
