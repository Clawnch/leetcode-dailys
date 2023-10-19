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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        //recursal(root, res);
        iterative(root, res);
        return res;
    }

    public void recursal(TreeNode root, List<Integer> res) {
        if (root != null) {
            recursal(root.left, res);
            res.add(root.val);
            recursal(root.right, res);
        }
    }

    public void iterative(TreeNode root, List<Integer> res) {
        Stack<TreeNode> parents = new Stack<>();
        while (root != null  || !parents.isEmpty()) {
            while (root != null) {
                parents.push(root);
                root = root.left;
            }
            root = parents.pop();
            res.add(root.val);
            root = root.right;
        }
    }
}
