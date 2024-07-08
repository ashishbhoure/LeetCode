/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
        if(root == null){
            return res;
        }
        req(root, res);
        return res;
        
    }
      public void req(Node root, List<Integer> tree)
    {
        tree.add(root.val);
        for (Node child : root.children)
        {
            if (child != null)
                req(child, tree);
        }
    }
}