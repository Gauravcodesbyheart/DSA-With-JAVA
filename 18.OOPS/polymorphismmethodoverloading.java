public class polymorphismmethodoverloading {
    public static void main (String args[]){
        calculator calc = new calculator();            //object created 
        System.out.println(calc.sum(2,3));
        System.out.println(calc.sum(3.4f,5.6f));   // different-different function of calculator class is called using the overloading concept  
        System.out.println(calc.sum(2,3,8));
    }
    
}
class calculator {
    int sum (int a,int b){
        return a+b;
    }
    float sum (float a,float b){
        return a+b;
        
    }

    int sum (int a, int b, int c){
        return a+b+c;
    }
}
