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
    private List<Integer> res=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
         traversal(root);
         return res;
    }
    public void traversal(TreeNode root)
    {
        if(root==null)
            return ;
        traversal(root.left);
        res.add(root.val);
        traversal(root.right);
    }
}