class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true; // Flag for non-decreasing order
        boolean decreasing = true; // Flag for non-increasing order

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false; // Breaks non-decreasing order
            }
            if (nums[i] < nums[i + 1]) {
                decreasing = false; // Breaks non-increasing order
            }
        }

        // The array is monotonic if either increasing or decreasing is true
        return increasing || decreasing;
    }
}
