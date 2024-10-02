/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>(); // List to hold the level-order traversal result
        if (root == null) {
            return arr; // Return empty list if the root is null
        }

        Queue<TreeNode> q = new LinkedList<>(); // Queue to traverse the tree level by level
        q.add(root); // Start with the root node

        while (!q.isEmpty()) {
            int size = q.size(); // Get the number of nodes at the current level
            List<Integer> newArr = new ArrayList<>(); // List to store values of nodes at the current level

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll(); // Remove the current node from the queue
                newArr.add(curr.val); // Add the node's value to the list for the current level

                // Add the left and right children to the queue for the next level
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            arr.add(newArr); // Add the list of values for the current level to the result
        }

        return arr; // Return the level-order traversal result
    }
}
