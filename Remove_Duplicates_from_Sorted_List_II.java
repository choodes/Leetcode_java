class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode cur=head;
        while(cur!=null){
            if(cur.next!=null && cur.val==cur.next.val){
                int dumval=cur.val;
                while(cur!=null && cur.val==dumval){
                    cur=cur.next;
                }
                prev.next=cur;
            }
            else{
                prev=cur;
                cur=cur.next;
            }
            
        }
        return dummy.next;
    }
}
