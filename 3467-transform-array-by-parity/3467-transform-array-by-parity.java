class Solution {
    public int[] transformArray(int[] nums) {
        int []newarr = new int[nums.length];

        for(int i =0; i<nums.length; i++){
            if(nums[i] % 2 ==0){
                newarr[i] = 0;
            }
            else{
                newarr[i] =1;
            }
        }
        Arrays.sort(newarr);
        return newarr;
        
    }
}