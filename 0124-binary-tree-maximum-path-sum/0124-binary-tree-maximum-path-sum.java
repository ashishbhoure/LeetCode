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
    public int maxPathSum(TreeNode root) {
        int[] maxVal = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        maxPath(root,maxVal);
        // return maxVal[0]<0?root.val:maxVal[0];
        return maxVal[0];
    }
    
    int maxPath(TreeNode root,int[] maxVal){
        if(root == null){
            return 0;
        }
        int left = maxPath(root.left,maxVal);
        int right = maxPath(root.right,maxVal);
        if(left < 0 ){
            left = 0;
        }
        if(right < 0){
            right = 0;
        }
        maxVal[0] = Math.max(maxVal[0],right+left+root.val);
        return Math.max(left,right)+root.val;
    }
}