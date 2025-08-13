public class hybridinheritance {
    public static void main (String args[]){
        Fish f = new Fish();
        Bird b = new Bird();
        Mammal m = new Mammal();
        Tuna t = new Tuna();
        Shark s = new Shark();
        Peacock p = new Peacock();
        Dog d = new Dog();
        f.swim();
        b.fly();
        m.warmblodded();
        t.size();
        s.small();
        p.importance();
        d.bark();
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eat.");
    }
    void breath(){
        System.out.println("Breath.");
    }

}
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
class Mammal extends Animal{
    void warmblodded(){
        System.out.println("Warm Blodded.");
    }
}
class Tuna extends Fish{
    void size(){
        System.out.println("Size");
    }
}
class Shark extends Fish{
    void small(){
        System.out.println("small.");
    }
}
class Peacock extends Bird{
    void importance(){
        System.out.println("Peacock is the national bird of the India");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("kripa can bark");
    }
}