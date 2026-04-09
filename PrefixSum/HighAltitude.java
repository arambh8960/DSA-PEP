class Solution {
    public int largestAltitude(int[] nums) {
        int[] prefix=new int[nums.length+1];
        prefix[0]=0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length+1;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
            
        }
        for(int i=0;i<nums.length+1;i++){
            max=Math.max(prefix[i],max);
            
        }
        return max>0?max:0;
    }
}