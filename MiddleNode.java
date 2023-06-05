class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head; 
        while(fast.next != null){
            if(fast.next.next != null)
                fast = fast.next.next;
            else
                fast = fast.next;    
            slow = slow.next;
        }
        return slow;
    }
}
