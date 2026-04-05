public class MultiLevelInheritence2 {
    public static void main (String args[]){
        Dog bob = new Dog();
        bob.eat();
        bob.breathe();
        bob.legs=4;
        bob.breed="German Shephard";
        System.out.println("The breed of the dog is "+bob.breed+" and the legs of the dog is "+bob.legs);
        
    } 
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats.");
    }
    void breathe(){
        System.out.println("Breaths.");
    }
}

class Mammal extends Animal{
    int legs;
}  
class Dog extends Mammal{
    String breed;
}
