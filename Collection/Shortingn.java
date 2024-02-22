package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {//implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Student that) {
//        if (this.age > that.age)//here we are comparing current student to other student.
//            return 1;
//        else
//            return -1;
//    }
}

public class Shortingn {
    public static void main(String[] args) {
        Comparator<Student> com = (Student i, Student j) -> {
//            if (i % 10 > j % 10)
//            if (i.age > j.age)
//                return 1;
//            else
//                return -1;
            return i.age> j.age?+1:-1;
        };

        List<Student> stud = new ArrayList<Student>();
        stud.add(new Student(12, "Ankit"));
        stud.add(new Student(24, "Rahul"));
        stud.add(new Student(65, "Mohanty"));
        stud.add(new Student(44, "Satya"));
//        Collections.sort(stud, com);//use to sorting the value.Remeber it is inthe COLLECTIONS class not Collection Interface.
        for (Student s : stud)
            System.out.println(s);

    }
}
