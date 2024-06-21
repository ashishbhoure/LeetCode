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
    
    int maxDiff;
    void findMaxDiffUtil(TreeNode root , TreeNode child){
        if(root == null || child == null){
            return ;
        }    
        
        maxDiff = Math.max(maxDiff, Math.abs(root.val-child.val));
        
        findMaxDiffUtil(root,child.left);
        findMaxDiffUtil(root,child.right);
    }
    
    
    void findMaxDiff(TreeNode root){
        if(root == null){
            return;
        }
        
        findMaxDiffUtil(root,root.left);
        findMaxDiffUtil(root, root.right);
        
        findMaxDiff(root.left);
        findMaxDiff(root.right);
    }
    
//     Optimal Solution 
    int findDiffUtil(TreeNode root,int maxV,int minV){
        if(root == null){
            return Math.abs(maxV - minV);
        }
        
        maxV = Math.max(maxV,root.val);
        minV = Math.min(minV, root.val);
        
        int l = findDiffUtil(root.left,maxV,minV);
        int r = findDiffUtil(root.right,maxV,minV);
        
        return Math.max(l , r);
    }
    
    
    public int maxAncestorDiff(TreeNode root) {
//         maxDiff = -1;
        
//         findMaxDiff(root);
        
//         return maxDiff;
        
        
//         for optimal solution
        return findDiffUtil(root,root.val,root.val);
    }
}