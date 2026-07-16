class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int t =0;
        int i =0;
        int n = tickets.length;
        while(tickets[k]>0){
            if(tickets[i] > 0){
                tickets[i] = tickets[i] - 1;
                t++;
            }
            i++;
            if(i ==n){
                i=0;
            }
        }
        return t;


        
    }
}