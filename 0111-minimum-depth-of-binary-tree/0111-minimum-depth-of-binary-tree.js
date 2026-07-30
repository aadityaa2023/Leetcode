var minDepth = function(root) {
        if (root == null)
            return 0;

        let lh = minDepth(root.left);
        let rh = minDepth(root.right);

        if (lh == 0 || rh == 0)
            return lh + rh + 1;

        return Math.min(lh, rh) + 1;
    
};