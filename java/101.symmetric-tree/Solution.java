class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isEqualTree(root.left, root.right);
    }

    public boolean isEqualTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.val != b.val) return false;
        return isEqualTree(a.left, b.right) && isEqualTree(a.right, b.left);
    }
}