class Solution {
    public int kthSmallest(TreeNode root, int k) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                maxheap.offer(node.val);
                if (maxheap.size() > k) {
                    maxheap.poll();
                }

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }

            }

        }
        return maxheap.peek();

    }
}