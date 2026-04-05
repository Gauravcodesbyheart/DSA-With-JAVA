public class SuperKeyword {
    public static void main (String args[]){
        Horse1 H1 = new Horse1();
        
    }
    
}
class Animal1{
    String color;
    Animal1(){
        System.out.println("Animal Cnstructor is called...");
        
    }
    
}
class Horse1 extends Animal1{
    
    Horse1(){
        super();
        super.color="Brown";
        
        System.out.println("Horse Cnstruictor is called..");
    }
    
}
