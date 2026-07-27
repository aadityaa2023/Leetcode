class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int k = spaces.length;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (j < k && i == spaces[j]) {
                ans.append(" ");
                j++;
            }
            ans.append(s.charAt(i));
        }

        return ans.toString();
    }
}