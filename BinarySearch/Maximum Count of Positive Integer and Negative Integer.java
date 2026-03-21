class Solution {
    public int maximumCount(int[] nums) {
        int n=lastNegative(nums)+1;
        int p=nums.length-firstPositive(nums);
        return Math.max(n,p);
    }
    public int lastNegative(int[] arr){
        int s=0;
        int e=arr.length-1;
        int idx=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]<0){
                idx=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return idx;
    }
    public int firstPositive(int[] arr){
        int s=0;
        int e=arr.length-1;
        int idx=arr.length;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]>0){
                idx=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return idx;
    }
}