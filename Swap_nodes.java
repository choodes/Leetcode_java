class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(prev.next!=null &&prev.next.next!=null){
            ListNode f=prev.next;
            ListNode s=prev.next.next;
            f.next=s.next;
            s.next=f;
            prev.next=s;
            prev=f;
        }
        return dummy.next;
    }
    
}
