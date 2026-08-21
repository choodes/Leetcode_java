class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closetsum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-1;i++){
            int p1=i+1;
            int p2=nums.length-1;
            while(p1<p2){
                int sum=nums[i]+nums[p1]+nums[p2];
                if(Math.abs(sum-target)<Math.abs(closetsum-target)){
                    closetsum=sum;
                }
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    p1++;
                }
                else{
                    p2--;
                }
            }
            
        }
        return closetsum;
    }
}
