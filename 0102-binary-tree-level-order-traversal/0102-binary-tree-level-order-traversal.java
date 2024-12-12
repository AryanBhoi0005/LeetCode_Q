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
      List<List<Integer>> list=new ArrayList<>();
      if(root==null){
        return list;
      }
      ArrayList<Integer> arr=new ArrayList<>();
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      q.add(null);
      while(!q.isEmpty()){
        TreeNode temp=q.poll();
        if(temp==null){
           if(q.isEmpty()){
             break;
           }
           list.add(new ArrayList<>(arr));  
           arr.clear();
           if(!q.isEmpty()){
           q.add(null);
           }
        }
        else{
            arr.add(temp.val);
            if(temp.left!=null){
               q.add(temp.left); 
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
      }
      if(!arr.isEmpty()){
         list.add(new ArrayList<>(arr));
      }
      return list;
    }
}