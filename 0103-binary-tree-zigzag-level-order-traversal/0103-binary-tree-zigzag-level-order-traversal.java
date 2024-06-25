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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null){
            return result;
        }
        
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
         boolean leftToRight = true;
        
        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> list = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node = qu.poll();
                
                // int index = (leftToRight)? i:size-1-i;
                
                list.add(node.val);
                
                if(node.left != null){
                    qu.offer(node.left);
                }
                if(node.right != null){
                    qu.offer(node.right);
                }
            }
            if(!leftToRight){
                Collections.reverse(list);
            }
            leftToRight = !leftToRight;
            result.add(list);
        }
        
        return result;
        
    }
}