public class GetSet {
    public static void main (String args[]){
        pen p1= new pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.tip+" Thi sis the tip of the pen.");
        System.out.println(p1.color+" This is the color of the pen."); 
    }
}
class pen{
    String color;
    int tip;
    String getColor(){
        return this.color;
    }
    int  getTip(){
        return this.tip;
    }
    void setColor(String color){
        color=this.color;
    }
    void setTip(int tip){
        tip=this.tip;
    }
}
