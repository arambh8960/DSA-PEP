class Solution {
    public int maximumSum(int[] nums) {
        int be=nums[0];
        int ans=nums[0];
        int del=0;
        
        for(int i=1;i<nums.length;i++){
          del=Math.max(be,del+nums[i])  ;
          be=Math.max(be+nums[i],nums[i]);
          ans=Math.max(Math.max(be,del),ans);
           

        }
        return ans;
        
    }
}