
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {

        if (root == null)
            return -1;

        PriorityQueue<Long> pq = new PriorityQueue<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            long levelsum = 0;
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
            pq.offer(levelsum);
            if (pq.size() > k) {
                pq.poll();
            }

        }
        if (pq.size() < k)
            return -1;
        return pq.peek();

    }
}