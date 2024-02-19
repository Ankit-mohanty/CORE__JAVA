package Array;

class Student {
    String name;
    int rollno;
    int marks;
}

public class MultipleArray {
    public static void main(String[] args) {
       /* int num[] = new int[6];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        int n= num.length;
//        for (int i = 0; i < 6; i++) {
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
        System.out.println();
    }*/
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.rollno = 1;
        s1.marks = 22;

        Student s2 = new Student();
        s2.name = "Ram";
        s2.rollno = 2;
        s2.marks = 23;

        Student s3 = new Student();
        s3.name = "Ankit";
        s3.rollno = 3;
        s3.marks = 24;

        Student stud[] = new Student[3];//  here  Array.Student is  a data type not a class.here we are creating the array who carries the values of student.
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

//        System.out.println(s1.name + " : " + s1.rollno + " : " + s1.marks); // here we only print the values of s1 only
//        int s = stud.length;
//        for (int i = 0; i < s; i++) {
////            System.out.println(s1);// here we print the address of s1.
//            System.out.println(stud[i].name + " : " + stud[i].rollno + " : " + stud[i].marks);// here we print all students data.
//        }
        for (Student students : stud) {//Here Array.Student is a data type like String and integer. this is called enhanced for lope.
            System.out.println(students.name + " : " + students.marks);
        }
    }
}
