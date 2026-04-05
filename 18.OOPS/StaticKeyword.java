public class StaticKeyword {
    public static void main (String args[]){
        Student s1 = new Student();
        Student.SchoolName="SVM";
        Student s2 = new Student();
        s2.roll = 101;
        System.out.println(Student.SchoolName+" is the name of the school for also the s2 student as the school name is created as static.");
        System.out.println("Student roll number: " + s2.roll);
        s1.setName("Gaurav");
        System.out.println(s1.getname("Gaurav")+" ");
    }
}
class Student{
    String name;
    int roll;
    static String SchoolName;
    void setName(String name){
        this.name=name;
    }
    String getname (String name){
        return this.name;
    }
}
