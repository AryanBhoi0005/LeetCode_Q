class Solution {
    public int thirdMax(int[] nums) {
        Integer f = null; // First maximum
        Integer s = null; // Second maximum
        Integer t = null; // Third maximum

        for (int key : nums) {
            // Skip duplicates
            if ((f != null && key == f) || (s != null && key == s) || (t != null && key == t)) {
                continue;
            }

            // Update the maximums
            if (f == null || key > f) {
                t = s;
                s = f;
                f = key;
            } else if (s == null || key > s) {
                t = s;
                s = key;
            } else if (t == null || key > t) {
                t = key;
            }
        }

        // Return the third maximum if it exists, otherwise return the first maximum
        return t == null ? f : t;
    }
}
