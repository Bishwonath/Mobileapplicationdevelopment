public class FiveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        // If the array is empty, there are no unique elements
        if (nums.length == 0) {
            return 0;
        }
        
        int k = 1; // Pointer for the next unique element
        
        // Traverse through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous element, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];  // Update the element at index k
                k++;  // Increment k for the next unique element
            }
        }
        
        // Return the number of unique elements
        return k;
    }

    public static void main(String[] args) {
        // Example array (sorted in non-decreasing order)
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        
        // Call the function to remove duplicates
        int k = removeDuplicates(nums);
        
        // Output the number of unique elements
        System.out.println("Number of unique elements: " + k);
        
        // Output the modified array with unique elements
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
