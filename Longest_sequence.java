class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int max=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]+1==nums[i+1]){
                c++;
            }
            else{
                c=0;
            }
            max=Math.max(c,max);
            
        }
        if(max>=0){
            max+=1;
        }
        return max;
    }
}
