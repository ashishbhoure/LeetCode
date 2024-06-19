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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        int lev = 0;
        
        rightSide(root,lev,list);
        
        return list;
    }
    
    public void rightSide(TreeNode root, int lev, List<Integer> list){
        if(root == null){
            return;
        }
        
        if(lev == list.size()){
            list.add(root.val);
        }
        
        rightSide(root.right,lev+1,list);
        rightSide(root.left,lev+1,list);
        
    }
}