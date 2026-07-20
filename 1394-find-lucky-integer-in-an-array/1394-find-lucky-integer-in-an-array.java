class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int max  =-1;

        for(int k: map.keySet()){
            if(k == map.get(k)){
                max = Math.max(max, k);
            }
        }
        return max;
        
    }
}