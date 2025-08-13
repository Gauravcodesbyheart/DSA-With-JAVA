public class polymorphismmethodoverriding {
    public static void main (String args[]){
        Deer d = new Deer();
        d.eat();
    }
    
}
class Animal{
    void eat(){
        System.out.println("Eats anything.");  // Animal having the method eat
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass.");     // Deer inherits the Animal all properties so eat method also inherited but eat method is overriding.
    }
}
