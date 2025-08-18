class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isEqualTree(p, q);
    }


    public boolean isEqualTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.val != b.val) return false;
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