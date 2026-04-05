public class Basics{
    public static void main (String args[]){
        Pen p1=new Pen();
        p1.setColor("Black");
        System.out.println(p1.color+"  is the color of the pen");
        p1.setTip(5);
        System.out.println(p1.tip+" is the tip of the pen.");
        BankAccount b1=new BankAccount();
        b1.username="Gaurav Singh";
        
        System.out.println(b1.username+" is the name of the bank account");
     
    }  
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
} 
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem, int math){
        percentage=(phy+chem+math)/3;
    }
}
