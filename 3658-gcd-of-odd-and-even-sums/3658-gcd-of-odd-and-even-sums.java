class Solution {
    public int gcdOfOddEvenSums(int n) {
        int e = 0;
        int o = 0;
        for (int i = 1; i <= n; i++) {
            e = 2 * i + e;
            o = 2 * i - 1 + o;
        }
        while (o != 0) {
            int temp = o;
            o = e % o;
            e = temp; 
        }
        return e;
        

    }
}