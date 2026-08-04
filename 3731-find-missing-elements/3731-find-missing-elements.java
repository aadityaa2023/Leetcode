class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length -1];

        for(int i=min;i<=max;i++){
            boolean flag=true;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    flag=false;
                }
            }
            if(flag){
                ans.add(i);
            }
        }
        return ans;
       
    }
}