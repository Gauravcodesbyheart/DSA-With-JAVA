public class constructorinjava {
    public static void main (String args[]){
        student s1 = new student();            // also termed as constructor overloading as multiple types of parameters used for the same class
        System.out.println(s1+"");
        student s2 = new student("Gaurav");
        System.out.println(s2.name+"");   
        student s3 = new student (123);

        
        System.out.println(s3.roll+"");

    }
}
class student {
    String name;
    int roll;


    student(){   // it is constructor as class student have function name same as the class i.g,student
        System.out.println("Constructor is called");
    }
    student(String name){  // parameterized constructor
        this.name = name;    
    }
    
    student (int roll){    // parameterized constructor
        this.roll = roll;
    }
}
