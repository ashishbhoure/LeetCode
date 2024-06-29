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
    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int resutLevel = 0;
        
         int currentLevel = 1;
        
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        
        while(!qu.isEmpty()){
            int sum = 0;
           
            int n = qu.size();
            for(int i=0;i<n;i++){
                TreeNode temp = qu.peek();
                 qu.poll();
                sum += temp.val;
               
                if(temp.left != null)
                    qu.offer(temp.left);
                if(temp.right != null)
                    qu.offer(temp.right);
                
            }
            if(sum > maxSum){
                maxSum = sum;
                resutLevel = currentLevel;
            }
            
            currentLevel++;
        }
        return resutLevel;
    }
}