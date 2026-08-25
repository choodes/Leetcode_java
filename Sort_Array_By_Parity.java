class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int len=nums.length-1;
        while(i<len){
            if(nums[i]%2!=0){
               int temp=nums[len];
                nums[len]=nums[i];
                nums[i]=temp;
                len--;
            }
            else{
                i++;
            }
        }
        return nums;
    }
}
