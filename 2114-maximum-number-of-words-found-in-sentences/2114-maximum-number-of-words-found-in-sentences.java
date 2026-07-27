class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxcount=0;
        for(int i=0; i<sentences.length; i++) {
            maxcount = Math.max(maxcount,(sentences[i].split(" ")).length);
        }
        return maxcount;
    }
}