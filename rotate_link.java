class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int l=0;
        ListNode tail=head;

        while(tail.next!=null){
          tail=tail.next;
          l++;
        }
        l++;
        k=k%l;
        if(k==0){
            return head;
        }
        tail.next=head;
        for (int i=1;i<l-k;i++){
            head=head.next;
        }
        ListNode newhead=head.next;
        head.next=null;
        return newhead;

    }
}
