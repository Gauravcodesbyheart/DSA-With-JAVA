                                         //Multi level inheritance
public class singleinheritance{
    public static void main (String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}

//base child

class Animal {
    String color;
    void eat(){
        System.out.println("Eats.");
    }
    void breathes(){
        System.out.println("Breathes.");
    }
}
// child class(Derived Class)

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Fish can swims in the water.");
    }
}
