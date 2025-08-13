public class hierarchicalinheritance {
    public static void main (String args[]){
        Mammal mam = new Mammal();
        Fish f = new Fish();
        Dog d = new Dog();
        mam.walk();
        mam.breath();
        f.swim();
        d.bark();

    }
}
class Animal{
    String color;
    void breath(){
        System.out.println("Breath.");
    }
    void eat(){
        System.out.println("Eat.");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swim.");
    }
}
class Dog extends Animal{   

    void bark(){
        System.out.println("Bark.");
    }
}
