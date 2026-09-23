class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while(i>0 && nums[i]<=nums[i-1]){
            i--;
        }
        if(i==0){
            reverse(nums,i,nums.length-1);
            return;
        }
        int j=nums.length-1;
        while(j>=i && nums[j]<=nums[i-1]){
            j--;
        }
        swap(nums,i-1,j);
        reverse(nums,i,nums.length-1);
        
    }
    public void swap(int[] nums,int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
    public void reverse(int[] nums,int s,int e){
        while(s<e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
        s++;
        e--;}
    }
    
}
