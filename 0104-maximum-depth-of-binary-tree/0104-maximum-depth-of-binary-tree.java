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
    public int maxDepth(TreeNode root) {
        
//         DFS code 
        if(root == null){
            return 0;
            
        }
        
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        
//         BFS code 
//         if(root == null){
//             return 0;
//         }
//        Queue<TreeNode> qu = new LinkedList<>();
//         qu.add(root);
        
//         int level = 0;
        
//         while(!qu.isEmpty()){
//             int n = qu.size();
            
//             level++;
//             for(int i=0;i<n;i++){
//                TreeNode node = qu.poll();
                
//                 if(node.left != null){
//                     qu.add(node.left);
//                 }
//                 if(node.right != null){
//                     qu.add(node.right);
//                 } 
//             }
//         }
//         return level;
    }
}