class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, String> map = new HashMap<>();

        int[] newarr = score.clone();
        Arrays.sort(newarr);

        int n = newarr.length;
        for (int i = n - 1; i >= 0; i--) {
            int rank = n - i;
            if (rank == 1) {
                map.put(newarr[i], "Gold Medal");
            }
            else if (rank == 2) {
                map.put(newarr[i], "Silver Medal");
            }
            else if (rank == 3) {
                map.put(newarr[i], "Bronze Medal");
            } else {
                map.put(newarr[i], String.valueOf(rank));
            }
        }

        String[] ans = new String[n];

        for (int i = 0; i < n; i++) {
            ans[i] = map.get(score[i]);
        }

        return ans;

    }
}