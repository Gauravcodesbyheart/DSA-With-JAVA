public class AbstractClass {
    public static void main (String args[]){
        Horse chetak=new Horse();
        chetak.walk();
        chetak.changecolor();
        System.out.println(chetak.color+" ");
        Chicken desi = new Chicken();
        desi.eat();
        desi.walk();

    }
}
abstract class Animal{
    String color;
    void eat (){
        System.out.println("Animal eats.");
    }
    abstract void walk();
    Animal(){
        color="brown";
    }
}

class Horse extends Animal{
    void walk(){
        System.out.println("Can walk on the 4 legs.");
    }
    void changecolor(){
        color="Dark Brown";
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
    void changecolor(){
        color="Red";
    }

}
