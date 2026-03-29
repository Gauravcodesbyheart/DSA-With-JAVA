public class searchtargetelementinrotatedarray {
    public static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; 
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            else {
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + "  ");            
        }
        System.out.println("\n");

        int target = 0;
        int result = search(arr,target);
        System.out.println("The number is found at index " +result);
        
    }
}
