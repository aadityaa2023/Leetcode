class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        int lh = minDepth(root.left);
        int rh = minDepth(root.right);

        if (lh == 0 || rh == 0)
            return lh + rh + 1;

        return Math.min(lh, rh) + 1;

    }
}