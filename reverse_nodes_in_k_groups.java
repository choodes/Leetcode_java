class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail=head;
        if(head==null){return null;}
        for(int i=0;i<k;i++){
            if(tail==null){return head;}
            tail=tail.next;
        }
        ListNode newhead=reverse(head,tail);
        head.next=reverseKGroup(tail,k);
        return newhead;
        
    }
    private ListNode reverse (ListNode cur,ListNode end){
    
       ListNode prev=null;
        while(cur!=end){
            ListNode next=cur.next;
            cur.next=prev;
           prev=cur;
           cur=next;
        }
        return prev;
    }
}