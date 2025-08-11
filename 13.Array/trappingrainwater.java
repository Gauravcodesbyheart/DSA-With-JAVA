public class trappingrainwater {
    public static int traprainwater(int height[]){
        int n=height.length;
        //create a auxiliary for storing the left max boundry 
        // create a right maximum array for storing the min right boundry 
        // water trapped = (min(mnax left boundary,max right boundry)-height[i])*width;
        int leftmax[] = new int[n];
        int rightmax[] = new int [n];
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
        // creatting the left max boundry
        for (int i=1;i<=n-1;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);            
        }
        for (int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        // for storing the amount of water trapped
        int trappedwater=0; 
        for (int i=0;i<=n-1;i++){
            int watertrap = (Math.min(leftmax[i],rightmax[i]))-height[i]*1;
            trappedwater+=watertrap;            
        }
        return trappedwater;
        
    }
 public static void main (String args[]){
    int height[]= {4,2,0,6,3,2,5};
    int result = traprainwater(height);
    System.out.println("The amount of water stored int the given heights are: "+result);

 }   
}
