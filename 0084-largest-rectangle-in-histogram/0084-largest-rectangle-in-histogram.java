class Solution {
    public int largestRectangleArea(int[] heights) {
        // Next Right
        Stack<Integer> s = new Stack<>();
        int[] help1 = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                help1[i] = heights.length;  // No smaller element to the right, set to out of bounds
            } else {
                help1[i] = s.peek();
            }
            s.push(i);  // Push the index
        }

        // Next Left
        Stack<Integer> s2 = new Stack<>();
        int[] help2 = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!s2.isEmpty() && heights[s2.peek()] >= heights[i]) {
                s2.pop();
            }
            if (s2.isEmpty()) {
                help2[i] = -1;  // No smaller element to the left, set to -1
            } else {
                help2[i] = s2.peek();
            }
            s2.push(i);  // Push the index
        }

        // Calculate the maximum area
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = help1[i] - help2[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
}
