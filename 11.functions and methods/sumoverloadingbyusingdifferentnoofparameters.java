
public class sumoverloadingbyusingdifferentnoofparameters {
    public static int sum (int a,int b){
        int add = a+b;
        return add;
    }
        public static int sum (int a,int b,int c){
        int add = a+b+c;
        return add;
    }
    public static void main (String args[]){
        System.out.println("The sum of two numbers are : "+sum(1,2));
        System.out.println("The sum of two numbers are : "+sum(1,2,6));
    }
    
}
