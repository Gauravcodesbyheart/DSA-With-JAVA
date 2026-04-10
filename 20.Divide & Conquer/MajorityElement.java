
public class MajorityElement {
    public static int findMajority(int[] nums) {

        int candidate = 0;
        int count = 0;

        // Traverse array using traditional for loop
        for (int i = 0; i < nums.length; i++) {

            // If count becomes 0, choose new candidate
            if (count == 0) {
                candidate = nums[i];
            }

            // Increase or decrease count
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate; // Majority element
    }

    /**
     * Main method to test the algorithm
     */
    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = findMajority(nums);

        System.out.println("Majority Element: " + result);
    }
}