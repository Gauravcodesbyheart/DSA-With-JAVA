public class abstractinjava {
    public static void main (String args[]){
        Horse chetak  = new Horse();
        Chicken Murga = new Chicken();
        chetak.eat();
        chetak.walk();
        Murga.eat();
        Murga.walk();
        System.out.println(chetak.color);
        
    }
}
abstract class Animal{
    String color;
    void eat(){
        System.out.println("Animal eats.");
    }
    abstract void walk();  // abstract method have no implemenatation.
    Animal(){
        color ="brown";
    }
}
class Horse extends Animal {
    void walk(){
        System.out.println("Walks on 4 legs.");
    }
    void changecolor(){
        color="Darkbrown";
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs.");
    }
    void changecolor(){
        color = "Yellow";
    }
}