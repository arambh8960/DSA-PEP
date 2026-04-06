class Solution {
    public int maxProduct(int[] nums) {
        int bep=nums[0];
        int ben=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int p1=nums[i]*bep;
            int p2=nums[i];
            int p3=nums[i]*ben;
            ben=Math.min(p2,Math.min(p1,p3));
            bep=Math.max(Math.max(p1,p3),p2);
            
            
            ans=Math.max(Math.max(ben,bep),ans);
        }
        retur ans;
    }
}