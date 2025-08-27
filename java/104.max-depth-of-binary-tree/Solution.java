/**
 * LeetCode Problem 104: Maximum Depth of Binary Tree
 *
 * PROBLEM DESCRIPTION:
 * Given the root of a binary tree, return its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * EXAMPLES:
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 *
 * Example 2:
 * Input: root = [1,null,2]
 * Output: 2
 *
 * Example 3:
 * Input: root = []
 * Output: 0
 *
 * CONSTRAINTS:
 * - The number of nodes in the tree is in the range [0, 10^4].
 * - -100 <= Node.val <= 100
 *
 * ALGORITHM APPROACH:
 * 1. Use recursion to compute the depth of left and right subtrees
 * 2. The depth of the tree is 1 + max(left depth, right depth)
 * 3. Base case: if node is null, depth is 0
 *
 * TIME COMPLEXITY: O(n) where n is the number of nodes in the tree
 * SPACE COMPLEXITY: O(h) where h is the height of the tree (recursion stack)
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * Main method to run test cases for max depth of binary tree
     */
    public static void main(String[] args) {
        // Example 1: root = [3,9,20,null,null,15,7]
        TreeNode root1 = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.maxDepth(root1)); // Expected: 3

        // Example 2: root = [1,null,2]
        TreeNode root2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println("Test 2: " + sol.maxDepth(root2)); // Expected: 2

        // Example 3: root = []
        TreeNode root3 = null;
        System.out.println("Test 3: " + sol.maxDepth(root3)); // Expected: 0

        // Example 4: root = [1]
        TreeNode root4 = new TreeNode(1);
        System.out.println("Test 4: " + sol.maxDepth(root4)); // Expected: 1
    }
}
