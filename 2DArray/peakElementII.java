class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            //if mid is less than its next element
            //then peak must be in the right half
            if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }else{
                r=mid;

            }

            
        }
        return l;
    }
}