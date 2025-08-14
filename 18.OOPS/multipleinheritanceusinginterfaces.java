public class multipleinheritanceusinginterfaces {
    public static void main (String args[]){
        Bear b = new Bear();
        b.eatsgrass();
        b.eatsflesh();

    }
    
}

interface Herbivorous{
    void eatsgrass();

}

interface Carnivorous {
    void eatsflesh();

}

class Bear implements Herbivorous, Carnivorous{
    public void eatsgrass(){
        System.out.println("Eats the both Grass and flesh");
    }

    public void eatsflesh(){
        System.out.println("Eats the Flesh only by killing animals.");
    }


}
