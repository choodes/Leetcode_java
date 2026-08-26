class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode curr=head;
        int sum=0;
        while(curr!=null){
            int curvalue=curr.val;
            sum=curvalue+sum*2;
            curr=curr.next;
        }
        return sum;
    }
}
