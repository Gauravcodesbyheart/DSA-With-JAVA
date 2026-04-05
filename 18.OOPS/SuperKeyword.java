public class SuperKeyword {
    public static void main (String args[]){
        Horse1 H1 = new Horse1();
        System.out.println("Horse color is: " + H1.color);
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
        
        System.out.println("Horse Cnstructor is called..");
    }
    
}
