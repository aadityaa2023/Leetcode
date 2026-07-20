class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return list;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            int next = nums[i + 1];

            while (current + 1 < next) {
                list.add(current + 1);
                current++;
            }
        }

        return list;
    }
}