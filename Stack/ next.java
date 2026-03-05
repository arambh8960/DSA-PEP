class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> s=new Stack<>();
        int[] nG=new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            while(!s.isEmpty()&& s.peek()<=nums[i%n]){

                s.pop();
            }
            if(i<n){
            if(s.isEmpty()){
                nG[i]=-1;

            }else{
                nG[i]=s.peek();
            }
            }
            s.push(nums[i%n]);
        }
        return nG;
        
    }
}