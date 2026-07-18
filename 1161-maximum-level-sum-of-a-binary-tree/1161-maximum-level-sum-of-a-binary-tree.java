class Solution {
    public int maxLevelSum(TreeNode root) {
        int maxlevel = 1;
        int maxsum = Integer.MIN_VALUE;
        int level = 1;
        if (root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int levelsum = 0;
            int levelsize = q.size();
            for (int i = 0; i < levelsize; i++) {
                TreeNode node = q.poll();
                levelsum = levelsum + node.val;
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            if (levelsum > maxsum) {
                maxsum = levelsum;
                maxlevel = level;
            }

            level++;

        }
        return maxlevel;

    }
}