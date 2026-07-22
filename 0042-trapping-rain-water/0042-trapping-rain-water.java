class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int totalWater = 0;

        int lmax = 0;
        int rmax = 0;

        int i = 0;
        int j = n - 1;

        while (i < j) {

            lmax = Math.max(lmax, height[i]);
            rmax = Math.max(rmax, height[j]);

            if (lmax < rmax) {

                totalWater += lmax - height[i];
                i++;

            } else {

                totalWater += rmax - height[j];
                j--;
            }
        }

        return totalWater;
    }
}