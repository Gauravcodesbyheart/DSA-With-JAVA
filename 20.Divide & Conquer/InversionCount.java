
public class InversionCount {

    public static int mergeSort(int[] arr, int left, int right) {
        int count = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            // Count inversions in left half
            count += mergeSort(arr, left, mid);

            // Count inversions in right half
            count += mergeSort(arr, mid + 1, right);

            // Count cross inversions during merge
            count += merge(arr, left, mid, right);
        }

        return count;
    }

    /**
     * Merge two sorted halves and count inversions
     */
    public static int merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        int count = 0;

        // Merge + count inversions
        while (i < n1 && j < n2) {

            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                
                //  KEY LINE
                count += (n1 - i);      //add all remainging inversions to the count 
            }
        }

        // Copy remaining elements
        while (i < n1)
            arr[k++] = leftArr[i++]; 

        while (j < n2)
            arr[k++] = rightArr[j++];

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};

        int result = mergeSort(arr, 0, arr.length - 1);

        System.out.println("Inversion Count: " + result);
    }
}