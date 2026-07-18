class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int o = nums[0];
        int e = nums[nums.length-1];


        while (o != 0) {
            int temp = o;
            o = e % o;
            e = temp; 
        }
        return e;

        
    }
}