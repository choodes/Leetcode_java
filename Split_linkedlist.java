class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int c=0;
        ListNode cur=head;
        while(cur!=null){
            c++;
            cur=cur.next;
            
        }
        
        int size=c/k;
        int remain=c%k;
        ListNode curr=head;
        ListNode prev=curr;
        for(int i=0;i<k;i++){
            int cursize=size;
            if(remain>0){
                cursize++;
                remain--;
            }
            ListNode newpart=curr;
            int j=0;
            
            while(j<cursize){
                prev=curr;
                curr=curr.next;
                j++;
            }
            if(prev!=null){
                prev.next=null;
            }
            ans[i]=newpart;
        }
        return ans;
    }
}
