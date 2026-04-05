public class ConstructorInJava {
    public static void main (String args[]){
        Student s1 = new Student("Gaurav Singh", 21);
        Student s2 = new Student("Gaurav");
        Student s3 = new Student(21);
        
        System.out.println(s1.name+" is the name of the student and "+s1.age+" is the age of the person.");
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
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

}
