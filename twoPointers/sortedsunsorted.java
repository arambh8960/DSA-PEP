class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int i=1;
        int j=nums.length-2;
        int start=-1;
        int end=-2;
        int max=nums[0];
        int min=nums[nums.length-1];

        while(i<nums.length||j>=0){
            if(i<nums.length){
            max=Math.max(nums[i],max);
            if(nums[i]<max){
                end=i;
            }
            i++;

            }
            if(j>=0){
                min=Math.min(nums[j],min);
                if(nums[j]>min){
                    start=j;
                }
                j--;
            }
            
        }
        return end-start+1;
    }
}