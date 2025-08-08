public class optimizedprime {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if (n==2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                isPrime = true;
            }
        }
        return isPrime;
    
    } 
    public static void main (String args[]){
        System.out.println(isPrime(7)+" 7 is the prime number");
        
    }
    
}
