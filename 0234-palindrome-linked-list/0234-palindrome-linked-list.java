class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        ListNode fh = head;
        ListNode sh = reverse(slow);
        while (sh != null) {
            if (fh.val != sh.val) {
                return false;
            }
            sh = sh.next;
            fh = fh.next;
            
        }
        return true;
    
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }
}