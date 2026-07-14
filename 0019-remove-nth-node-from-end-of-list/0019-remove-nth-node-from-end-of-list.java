
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int l =0;
        ListNode curr = head;
        while(curr!=null){
            l++;
            curr = curr.next;
        }

        curr = dummy;

        for(int i =0; i< l -n; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return dummy.next;   
    }
}