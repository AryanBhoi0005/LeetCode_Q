class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // Ensure we are not comparing the same indices
                if (i != j) {
                    // Check if one element is double of another
                    if (arr[i] == 2 * arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
