class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {

            minheap.offer(num);

            if (minheap.size() > 3) {
                minheap.poll();
            }

        }
        if (minheap.size() == 3) {
            return minheap.peek();
        }
        while (minheap.size() > 1) {
            minheap.poll();
        }

        return minheap.peek();
    }
}