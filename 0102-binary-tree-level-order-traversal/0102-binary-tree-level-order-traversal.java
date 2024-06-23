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
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Queue<TreeNode> qu = new LinkedList<>();
        
        if(root == null)
            return list;
        
        qu.offer(root);
        
        while(!qu.isEmpty()){
            int lev = qu.size();
            List<Integer> subList = new LinkedList<>();
            
            for(int i=0;i<lev;i++){
                if(qu.peek().left != null)
                    qu.offer(qu.peek().left);
                if(qu.peek().right != null)
                    qu.offer(qu.peek().right);
                
                subList.add(qu.poll().val);
            }
            list.add(subList);
        }
        return list;
    }
}