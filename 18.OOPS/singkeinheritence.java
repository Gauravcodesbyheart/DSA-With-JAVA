public class singkeinheritence {
    public static void main (String args[]){
        Fish shark=new Fish();
        shark.swim();
        shark.breathe();
;    }

}
    class Animal{
        String color;
        void eat(){
            System.out.println("Animal eats the food.");
        }
        void breathe(){
            System.out.println("Animal breaths."); 
        }
    }
    class Fish extends Animal{
        void swim(){
            System.out.println("Fish can swim in water.");
        }
    }

