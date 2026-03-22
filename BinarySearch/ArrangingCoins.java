class Solution {
    public int arrangeCoins(int n) {
        long s=0;
        long e=n;
        long ans=-1;
        while(s<=s){
            long mid=s+(e-s)/2;
            if(mid*(mid+1)/2<=n){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return (int)ans;


    }
}