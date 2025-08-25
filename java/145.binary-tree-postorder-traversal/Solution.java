/**
 * LeetCode Problem 145: Binary Tree Postorder Traversal
 *
 * PROBLEM DESCRIPTION:
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 *
 * Postorder traversal visits nodes in the following order:
 *   1. Traverse the left subtree
 *   2. Traverse the right subtree
 *   3. Visit the root node last
 *
 * EXAMPLES:
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [3,2,1]
 *
 * Example 2:
 * Input: root = []
 * Output: []
 *
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 *
 * CONSTRAINTS:
 * - The number of nodes in the tree is in the range [0, 100].
 * - -100 <= Node.val <= 100
 *
 * ALGORITHM APPROACH:
 * 1. Use recursion to visit nodes in postorder (Left -> Right -> Root)
 * 2. Recursively traverse the left and right subtrees
 * 3. Add the value of the current node to the result list last
 *
 * TIME COMPLEXITY: O(n) where n is the number of nodes in the tree
 * SPACE COMPLEXITY: O(h) where h is the height of the tree (recursion stack)
 */
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        travel(root, path);
        return path;
    }

    private void travel(TreeNode root, List<Integer> path) {
        if (root == null) return;
        travel(root.left, path);
        travel(root.right, path);
        path.add(root.val);
    }

    /**
     * Main method to run test cases for postorder traversal
     */
    public static void main(String[] args) {
        // Test case 1: root = [1, null, 2, 3]
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.postorderTraversal(root1)); // Expected: [3,2,1]

        // Test case 2: root = []
        TreeNode root2 = null;
        System.out.println("Test 2: " + sol.postorderTraversal(root2)); // Expected: []

        // Test case 3: root = [1]
        TreeNode root3 = new TreeNode(1);
        System.out.println("Test 3: " + sol.postorderTraversal(root3)); // Expected: [1]

        // Test case 4: root = [1,2,3]
        TreeNode root4 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println("Test 4: " + sol.postorderTraversal(root4)); // Expected: [2,3,1]
    }
}
