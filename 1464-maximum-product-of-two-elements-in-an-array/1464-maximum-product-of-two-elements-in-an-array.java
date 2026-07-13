class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxprod = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int prod = (nums[i] - 1) * (nums[j] - 1);
                maxprod = Math.max(maxprod, prod);
            }
        }

        return maxprod;
    }
}