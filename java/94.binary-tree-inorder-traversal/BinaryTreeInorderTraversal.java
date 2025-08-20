import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Problem 94: Binary Tree Inorder Traversal
 * 
 * PROBLEM DESCRIPTION:
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * 
 * EXAMPLES:
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
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
 * 1. Inorder traversal follows the pattern: Left -> Root -> Right
 * 2. This means for each node:
 *    - First visit all nodes in the left subtree
 *    - Then visit the current node (add to result)
 *    - Finally visit all nodes in the right subtree
 * 3. Use recursive approach with helper method
 * 4. For binary search trees, inorder traversal returns values in sorted order
 * 
 * TIME COMPLEXITY: O(n) where n is the number of nodes in the tree
 * SPACE COMPLEXITY: O(h) where h is the height of the tree (recursion stack) + O(n) for result list
 * 
 * FOLLOW-UP: Can you solve it iteratively using a stack?
 */
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


public class BinaryTreeInorderTraversal {
    /**
     * Main method to perform inorder traversal of binary tree
     * @param root The root node of the binary tree
     * @return List of node values in inorder sequence
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        travelNode(root, result);
        return result;
    }

    /**
     * Helper method to recursively traverse the tree in inorder fashion
     * Inorder: Left subtree -> Current node -> Right subtree
     * @param node Current node being processed
     * @param path List to store the traversal result
     */
    public void travelNode(TreeNode node, List<Integer> path) {
        // Base case: if node is null, return
        if (node == null) return;
        
        // Step 1: Traverse left subtree first
        travelNode(node.left, path);
        
        // Step 2: Process current node (add to result)
        path.add(node.val);
        
        // Step 3: Traverse right subtree last
        travelNode(node.right, path);
    }
}
