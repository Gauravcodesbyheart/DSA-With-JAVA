public class copyconstructor {
    public static void main (String args[]){
        student s1 = new student();  // object s1
        s1.name = "Gaurav";
        s1.roll = 456;
        s1.password = "ABCD";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        student s2 = new student(s1);  // create s2 as object 2 and pass s1 object as parameter in s2 dosing so 
        s2.password = "XYZ";                               // all properties of s1 comes in s2
                                        // ek object me dusre object ke saare featues aa jaye
         
        s1.marks[2]=88; // marks jab s1 me chnage hoga phir bhi s2 me reflect nhi karega
                                     // s2 obj me sara properties same as it is s1 wala hai lekin password chnage kar diye hai hum log
        for (int i=0;i<=2;i++){
            System.out.println(s2.marks[i]);  // all marks of s1 copied to s2 
        }
    }
    
}
class student {
    String name;
    int roll;
    String password;
    int marks[];

    // student(student s1){  // copy constructor s1 object  ki properties ko s2 me de diya  
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks; // shallow copy constructor  is created 

    // }

        student(student s1){  // copy constructor s1 object  ki properties ko s2 me de diya  
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = new int[3];
        for (int i=0;i<=marks.length-1;i++){    // deep copy os constructor is created
            this.marks[i]=s1.marks[i];
        } 

    }
    student(){
        marks = new int[3];
        System.out.println("Constructor is called ....");
        
    }
    student(String name){
        marks = new int[3];
         this.name = name;
    }
    student (int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
