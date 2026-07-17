class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : stones) {
            maxheap.offer(num);
        }
        while (maxheap.size() > 1) {
            int f = maxheap.poll();
            int s = maxheap.poll();

            if (f != s) {
                maxheap.offer(f - s);
            }
        }
        if (maxheap.isEmpty()) {
            return 0;

        } 
        else {
           return maxheap.peek();
        }

    }
}