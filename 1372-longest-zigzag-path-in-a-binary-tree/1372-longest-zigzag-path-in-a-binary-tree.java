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
    
//     method one 
    
//     int maxPath = 0;
    
//     void solve(TreeNode root , int steps, boolean goleft){
//         if(root == null){
//             return;
//         }    
        
//         maxPath = Math.max(maxPath , steps);
        
//         if(goleft == true){
//             solve(root.left,steps+1,false);
//             solve(root.right,1,true);
//         }else{
//             solve(root.right,steps+1,true);
//             solve(root.left,1,false);
//         }
//     }
    
    
    
//     othe method 
    
    int maxPath = 0;
    void solvePath(TreeNode root,int left,int right){
        if(root == null){
            return;
        }
        int max = Math.max(left,right);
        maxPath = Math.max(maxPath , max);
        
        solvePath(root.left,right+1,0);
        solvePath(root.right,0,left+1);
    }
    
    public int longestZigZag(TreeNode root) {
        // if(root == null){
            // return 0;
        // }
        // solve(root.left,1,false);
        // solve(root.right,1,true);
        
        
        solvePath(root,0,0);
        
        return maxPath;
    }
}