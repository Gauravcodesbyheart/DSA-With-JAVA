public class StaticKeyword {
    public static void main (String args[]){
        Student s1 = new Student();
        s1.SchoolName="SVM";
        Student s2 = new Student();
        System.out.println(s2.SchoolName+" is the name of the school for also the s2 student as the school name is created as static.");
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
