public class multilevelinheritance {
    public static void main (String args[]){
        Dog Bob = new Dog();
        Bob.eat();
        Bob.legs = 4;
        System.out.println(Bob.legs);
        System.out.println(Bob.breed="German shephard");
    }
    
}
class Animal{
    String color;

void eat(){
    System.out.println("Eats.");
}

void breath(){
    System.out.println("Breathes.");
}

}

class Mammal extends Animal{  // properties of animal inherited to mammal
    int legs;
}

class Dog extends Mammal{     // properties of mammal inherited to dog
    String breed;
}