/**
 * Definition for a binary tree node used in LeetCode tree problems.
 * 
 * STRUCTURE:
 * Each node contains:
 * - val: The integer value stored in the node
 * - left: Reference to the left child node (null if no left child)
 * - right: Reference to the right child node (null if no right child)
 * 
 * BINARY TREE PROPERTIES:
 * - Each node has at most two children (left and right)
 * - Nodes with no children are called leaf nodes
 * - The topmost node is called the root
 * - Height of tree = longest path from root to any leaf
 * - Depth of node = distance from root to that node
 * 
 * COMMON TREE TRAVERSALS:
 * - Inorder: Left -> Root -> Right
 * - Preorder: Root -> Left -> Right  
 * - Postorder: Left -> Right -> Root
 * - Level-order: Visit nodes level by level (BFS)
 */
public class TreeNode {
    int val;           // Value stored in this node
    TreeNode left;     // Reference to left child
    TreeNode right;    // Reference to right child
    
    // Default constructor creates node with value 0 and null children
    TreeNode() {}
    
    // Constructor with value only
    TreeNode(int val) {
        this.val = val;
    }
    
    // Constructor with value and both children
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
