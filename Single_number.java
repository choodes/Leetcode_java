class Solution {
    public int singleNumber(int[] nums) {
        int l=nums.length;
        int val=0;
        Arrays.sort(nums);
        if(l<=1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[l-1]!=nums[l-2]){
            return nums[l-1];
        }
        for(int i=1;i<nums.length-2;i++){
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                 val= nums[i];
            }
        }
        return val;
    }
}
