class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int l=0;
        int r=arr.length-1;
        int idx=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]>k)r=mid-1;
            else if(arr[mid]<k)l=mid+1;
            else{
                idx=mid;
                r=mid-1;
            }
        }
        return idx;
        
        
    }
}