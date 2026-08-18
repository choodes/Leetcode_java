class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE;
        int l=0;
        int cursum=0;
        for(int r=0;r<nums.length;r++){
            cursum+=nums[r];
            while(cursum>=target){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                }
                cursum-=nums[l];
                l++;
            }
        }
        return minlen !=Integer.MAX_VALUE?minlen:0;
    }
}
