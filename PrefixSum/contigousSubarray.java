class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int prefSum=0;
        int ans=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefSum+=(nums[i]==1?1:-1);
            if(map.containsKey(prefSum)){
                ans=Math.max(ans,i-map.get(prefSum));
            }else{
                map.put(prefSum,i);
            }

        }
        return ans;
    }
}