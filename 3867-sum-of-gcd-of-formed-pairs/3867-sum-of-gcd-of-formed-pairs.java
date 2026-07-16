class Solution {
    public long gcdSum(int[] nums) {

        int[] mx = new int[nums.length];
        mx[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            mx[i] = Math.max(mx[i - 1], nums[i]);
        }

        int[] pgcd = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pgcd[i] = gcd(nums[i], mx[i]);
        }

        Arrays.sort(pgcd);

        long ans = 0;
        int l = 0, r = pgcd.length - 1;

        while (l < r) {
            ans += gcd(pgcd[l], pgcd[r]);
            l++;
            r--;
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}