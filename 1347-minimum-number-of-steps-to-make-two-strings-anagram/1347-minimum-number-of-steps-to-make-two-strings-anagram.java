class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;

        }
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
        }
        int steps = 0;
        for (int f : count) {
            if (f > 0) {
                steps = steps + f;

            }
        }
        return steps;

    }
}