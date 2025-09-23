/**
 * LeetCode Problem 111: Minimum Depth of Binary Tree
 *
 * PROBLEM DESCRIPTION:
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * EXAMPLES:
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 2
 *
 * Example 2:
 * Input: root = [2,null,3,null,4,null,5,null,6]
 * Output: 5
 *
 * CONSTRAINTS:
 * - The number of nodes in the tree is in the range [0, 10^5].
 * - -1000 <= Node.val <= 1000
 *
 * ALGORITHM APPROACH:
 * 1. Use recursion to find the minimum depth of left and right subtrees
 * 2. Special cases to handle:
 *    - If root is null, return 0
 *    - If root is a leaf node (no children), return 1
 *    - If only one child exists, return depth of that child + 1
 *    - If both children exist, return minimum of their depths + 1
 *
 * IMPORTANT NOTE:
 * Unlike maximum depth, we cannot simply take min(left, right) + 1 because
 * if one subtree is null, that path doesn't lead to a leaf node.
 * We must only consider paths that actually reach leaf nodes.
 *
 * TIME COMPLEXITY: O(n) where n is the number of nodes in the tree
 * SPACE COMPLEXITY: O(h) where h is the height of the tree (recursion stack)
 */
public class Solution {
    /**
     * Find the minimum depth of a binary tree
     * @param root The root node of the binary tree
     * @return The minimum depth (shortest path to a leaf node)
     */
    public int minDepth(TreeNode root) {
        // Base case: empty tree has depth 0
        if (root == null) return 0;
        
        // If current node is a leaf, return 1
        if (root.left == null && root.right == null) return 1;
        
        // If only right child exists, go down the right path
        if (root.left == null) return minDepth(root.right) + 1;
        
        // If only left child exists, go down the left path
        if (root.right == null) return minDepth(root.left) + 1;
        
        // Both children exist, take the minimum depth + 1
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    /**
     * Main method to run test cases for minimum depth of binary tree
     */
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1: root = [1,null,2,3]
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        System.out.println("Test 1: " + sol.minDepth(root1)); // Expected: 2

        // Example 2: root = []
        TreeNode root2 = null;
        System.out.println("Test 2: " + sol.minDepth(root2)); // Expected: 0

        // Example 3: root = [1]
        TreeNode root3 = new TreeNode(1);
        System.out.println("Test 3: " + sol.minDepth(root3)); // Expected: 1

        // Additional Test case 4: root = [1,2,3,4,null,null,5]
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.right.right = new TreeNode(5);
        System.out.println("Test 4: " + sol.minDepth(root4)); // Expected: 2
    }
    
}
