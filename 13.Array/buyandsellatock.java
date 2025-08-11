public class buyandsellatock {
    public static int stockreturn(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit =0;
        for (int i=0;i<=prices.length-1;i++){
            buyprice = (i==0)? buyprice=prices[i]: Math.min(prices[i],buyprice);
            if (prices[i]>buyprice){
                int profit = prices[i]-buyprice;
                maxprofit = Math.max(profit,maxprofit);
            }
            // one other case also used for good solution, agar buy price sellprice se kam hai ya uske equal hai toh best yahi ho skta hai ki 
            // buyprice ko uss low value pe set kar do  
            // else{
            //     buyprice = prices[i];
            // }

        }
        return maxprofit;
    }
    public static void main (String args[]){
        int prices[] = {7,1,5,3,6,4};
        int result = stockreturn(prices);
        System.out.println("The maximum profit from the give stock prices is :"+result);
    
        

        
    }
    
}
