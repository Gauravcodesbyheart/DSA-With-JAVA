public class ConstructorInJava {
    public static void main (String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Gaurav");
        Student s3 = new Student(21);
        
        System.out.println(s2.name+" is the name of the student and "+s3.age+" is the age of the person.");
    }
}
class Student{
    String name;
    int age;

    Student(){
        System.out.println("Constructor is called just by creation the object ...");
    }
    Student(String name){
        this.name=name;
    }
    Student(int age){
        this.age=age;
    }

}
