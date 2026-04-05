public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Gaurav Singh";
        s1.roll = 30;
        s1.password = "Gaurav@";
        s1.marks[0] =20;
        s1.marks[1]=30;
        s1.marks[2]=40;
        Student s2 = new Student(s1);  // copy constructor is created.
        System.out.println(s2.name+" is the name fo the copy constructor. "+s2.roll+" is the roll no. of the student. ");
        for (int i=0;i<=s2.marks.length-1;i++){
            System.out.println(s2.marks[i]);
        }
    }

}

class Student {
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student() {
        System.out.println("Constructor is called..");
    }
}
