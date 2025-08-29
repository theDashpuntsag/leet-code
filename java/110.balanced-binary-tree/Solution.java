/**
 * LeetCode Problem 110: Balanced Binary Tree
 *
 * PROBLEM DESCRIPTION:
 * Given a binary tree, determine if it is height-balanced.
 * A height-balanced binary tree is a binary tree in which the depth of the two subtrees 
 * of every node never differs by more than 1.
 *
 * EXAMPLES:
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 *
 * Example 2:
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 *
 * Example 3:
 * Input: root = []
 * Output: true
 *
 * CONSTRAINTS:
 * - The number of nodes in the tree is in the range [0, 5000].
 * - -10^4 <= Node.val <= 10^4
 *
 * ALGORITHM APPROACH:
 * 1. For each node, check if the absolute difference between left and right subtree heights is <= 1
 * 2. Recursively check if both left and right subtrees are balanced
 * 3. A tree is balanced if:
 *    - Left subtree is balanced AND
 *    - Right subtree is balanced AND  
 *    - Height difference between left and right subtrees is at most 1
 *
 * OPTIMIZATION:
 * - Use a helper method that returns both height and balance status
 * - This avoids recalculating heights multiple times
 *
 * TIME COMPLEXITY: O(n) where n is the number of nodes in the tree
 * SPACE COMPLEXITY: O(h) where h is the height of the tree (recursion stack)
 */
public class Solution {
    
    /**
     * Check if a binary tree is height-balanced
     * @param root The root node of the binary tree
     * @return true if the tree is balanced, false otherwise
     */
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }
    
    /**
     * Helper method that returns the height of the tree if balanced, -1 if not balanced
     * @param node Current node being processed
     * @return Height of subtree if balanced, -1 if not balanced
     */
    private int checkBalance(TreeNode node) {
        // Base case: null node has height 0 and is balanced
        if (node == null) {
            return 0;
        }
        
        // Check left subtree
        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) {
            return -1; // Left subtree is not balanced
        }
        
        // Check right subtree
        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) {
            return -1; // Right subtree is not balanced
        }
        
        // Check if current node is balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // Current node is not balanced
        }
        
        // Return height of current subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }
    
    /**
     * Main method to run test cases for balanced binary tree
     */
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1: root = [3,9,20,null,null,15,7] - Balanced
        TreeNode root1 = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        System.out.println("Test 1 (Balanced tree): " + sol.isBalanced(root1)); // Expected: true
        
        // Test case 2: root = [1,2,2,3,3,null,null,4,4] - Not balanced
        TreeNode root2 = new TreeNode(1,
            new TreeNode(2,
                new TreeNode(3, new TreeNode(4), new TreeNode(4)),
                new TreeNode(3)
            ),
            new TreeNode(2)
        );
        System.out.println("Test 2 (Unbalanced tree): " + sol.isBalanced(root2)); // Expected: false
        
        // Test case 3: root = [] - Empty tree is balanced
        TreeNode root3 = null;
        System.out.println("Test 3 (Empty tree): " + sol.isBalanced(root3)); // Expected: true
        
        // Test case 4: root = [1] - Single node is balanced
        TreeNode root4 = new TreeNode(1);
        System.out.println("Test 4 (Single node): " + sol.isBalanced(root4)); // Expected: true
        
        // Test case 5: root = [1,2] - Simple unbalanced tree
        TreeNode root5 = new TreeNode(1, new TreeNode(2), null);
        System.out.println("Test 5 (Simple unbalanced): " + sol.isBalanced(root5)); // Expected: true (height diff = 1)
        
        // Test case 6: root = [1,2,null,3] - Height difference > 1
        TreeNode root6 = new TreeNode(1,
            new TreeNode(2, new TreeNode(3), null),
            null
        );
        System.out.println("Test 6 (Height diff > 1): " + sol.isBalanced(root6)); // Expected: false
    }
}
