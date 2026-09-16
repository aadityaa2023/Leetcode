class Solution {
    public int subsetXORSum(int[] nums) {
        int k=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            k|=nums[i];
        }
        return k*(1<<(n-1));
    }
}