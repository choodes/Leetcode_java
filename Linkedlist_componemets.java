class Solution {
    public int numComponents(ListNode head, int[] nums) {
        int c=0;
        boolean ingroup=false;
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        while(head!=null){
            if(set.contains(head.val)){
                if(!ingroup){
                    c++;
                    ingroup=true;
                    
                }
            }
            else{
                ingroup=false;
                
            }
            head=head.next;
        }
        return c;
    }
}
