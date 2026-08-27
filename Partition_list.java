    public ListNode partition(ListNode head, int x) {
        ListNode lessnode=new ListNode(0);
        ListNode morenode=new ListNode(0);
        ListNode less=lessnode;
        ListNode more=morenode;
        while(head!=null){
            if(head.val<x){
            less.next=head;
            less=less.next;
            }
        else{
            more.next=head;
            more=more.next;
        }
        head=head.next;}
        more.next=null;
        less.next=morenode.next;
        return lessnode.next;
            
    }
}
