public class HierarchialInheritence {
    public static void main (String args[]){
        Fish f = new Fish();
        Mammal m = new Mammal();
        Dog d = new Dog();
        f.swim();
        m.walk();
        d.bark();
    }
}
class Animal{
    String color;
    void breathe(){
        System.out.println("Can Breath.");
    }
    void eat(){
        System.out.println("Can Eat.");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Can Walk.");
    }
    
}
class Fish extends Animal{
    void swim(){
        System.out.println("Can Swim.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Can bark.");
    }
}
