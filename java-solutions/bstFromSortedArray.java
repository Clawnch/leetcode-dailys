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
    public TreeNode sortedArrayToBST(int[] nums) {
        int half = nums.length/2;
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int lower, int higher) {
        if (lower > higher) return null;
        int index = lower + (higher - lower) / 2;

        TreeNode node = new TreeNode(nums[index]);

        node.left = helper(nums, lower, index - 1);
        node.right = helper(nums, index + 1, higher);

        return node;
    }
}
