class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            long levelsum =0;
            int levelsize = q.size();
            for(int i =0; i<levelsize; i++){
                TreeNode node = q.poll();
                levelsum = levelsum + node.val;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            double avg = (double)levelsum/ levelsize;
            res.add(avg);

        }
        return res;

        
    }
}