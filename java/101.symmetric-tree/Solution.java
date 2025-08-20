/**
 * LeetCode Problem 101: Symmetric Tree
 * 
 * PROBLEM DESCRIPTION:
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * 
 * EXAMPLES:
 * Example 1:
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 * 
 * Example 2:
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 * 
 * CONSTRAINTS:
 * - The number of nodes in the tree is in the range [1, 1000].
 * - -100 <= Node.val <= 100
 * 
 * ALGORITHM APPROACH:
 * 1. A tree is symmetric if the left subtree is a mirror reflection of the right subtree
 * 2. Two trees are mirror reflections if:
 *    - Their roots have the same value
 *    - The right subtree of each tree is a mirror reflection of the left subtree of the other tree
 * 3. Use recursive approach comparing left and right subtrees of the root
 * 4. For mirror comparison: left.left should match right.right AND left.right should match right.left
 * 
 * TIME COMPLEXITY: O(n) where n is the number of nodes in the tree
 * SPACE COMPLEXITY: O(h) where h is the height of the tree (recursion stack)
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        // A tree is symmetric if its left and right subtrees are mirror images
        return isEqualTree(root.left, root.right);
    }

    /**
     * Helper method to check if two subtrees are mirror images of each other
     * @param a Left subtree node
     * @param b Right subtree node
     * @return true if the subtrees are mirror images, false otherwise
     */
    public boolean isEqualTree(TreeNode a, TreeNode b) {
        // Base case: both nodes are null (symmetric at this level)
        if (a == null && b == null) return true;
        
        // One node is null, other isn't - not symmetric
        if (a == null || b == null) return false;
        
        // Nodes exist but have different values - not symmetric
        if (a.val != b.val) return false;
        
        // For mirror symmetry: left.left should match right.right AND left.right should match right.left
        return isEqualTree(a.left, b.right) && isEqualTree(a.right, b.left);
    }
}