/**
 * LeetCode Problem 100: Same Tree
 * 
 * PROBLEM DESCRIPTION:
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * 
 * EXAMPLES:
 * Example 1:
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 * 
 * Example 2:
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 * 
 * Example 3:
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 * 
 * CONSTRAINTS:
 * - The number of nodes in both trees is in the range [0, 100].
 * - -10^4 <= Node.val <= 10^4
 * 
 * ALGORITHM APPROACH:
 * 1. Use recursive depth-first search (DFS) to compare both trees simultaneously
 * 2. Base cases:
 *    - If both nodes are null, return true (both trees end at same point)
 *    - If one node is null and other isn't, return false (different structure)
 *    - If node values are different, return false
 * 3. Recursively check if left subtrees are equal AND right subtrees are equal
 * 
 * TIME COMPLEXITY: O(min(m,n)) where m and n are the number of nodes in the trees
 * SPACE COMPLEXITY: O(min(m,n)) due to recursion stack in worst case (skewed tree)
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isEqualTree(p, q);
    }

    /**
     * Helper method to recursively compare two binary trees
     * @param a First tree node
     * @param b Second tree node
     * @return true if both subtrees are identical, false otherwise
     */
    public boolean isEqualTree(TreeNode a, TreeNode b) {
        // Base case: both nodes are null (end of both trees reached)
        if (a == null && b == null) return true;
        
        // One node is null, other isn't - trees have different structure
        if (a == null || b == null) return false;
        
        // Nodes exist but have different values
        if (a.val != b.val) return false;
        
        // Recursively check if left subtrees match AND right subtrees match
        return isEqualTree(a.left, b.left) && isEqualTree(a.right, b.right);
    }

    public static void main(String[] args) {
        // build first test tree:   1
        //                        /   \
        //                       2     3
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // build second test tree:  1
        //                        /   \
        //                       2     3
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Solution sol = new Solution();
        boolean same = sol.isSameTree(p, q);
        System.out.println("Trees are the same? " + same);
    }
}