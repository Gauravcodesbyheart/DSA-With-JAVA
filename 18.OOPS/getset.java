public class getset {
    public static void main (String args[]){
        pen p1 = new pen();
        p1.setcolor("blue");
        p1.settip(5);
        System.out.println(p1.getcolor()+"");
        System.out.println(p1.gettip()+"");
        
    }
}
class pen {
    String color;
    int tip;
    
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String newcolor){
        this.color = newcolor;
    }
    void settip(int newtip){
        this.tip=newtip;
    }
}
