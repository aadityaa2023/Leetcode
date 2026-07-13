class Solution {
    public int heightChecker(int[] heights) {
        int[] nh = Arrays.copyOf(heights, heights.length);
        Arrays.sort(nh);
        int count=0;
        for(int i =0; i<nh.length; i++){
            if(heights[i]!=nh[i]){
                count++;
            }
        }
        return count;

    }
}