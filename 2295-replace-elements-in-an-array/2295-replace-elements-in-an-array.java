class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int j=0; j<nums.length; j++){
            map.put(nums[j], j);
        }
        for(int []op : operations){
            int ov = op[0];
            int nv = op[1];

            int i = map.get(ov);
            nums[i] = nv;
            map.remove(ov);
            map.put(nv, i);
        }
        return nums;
        
    }
}