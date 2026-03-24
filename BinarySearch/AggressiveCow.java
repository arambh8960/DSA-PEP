class Solution {
    public boolean fun(int[] a,int n,int k,int mid ){
        int cows=1;
        int pp=a[0];
        for(int i=1;i<n;i++){
            int dist=a[i]-pp;
            if(dist<mid){
                continue;
            }
            cows++;
            pp=a[i];
            
        }
        if(k<=cows)return true;
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n=stalls.length;
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[n-1]-stalls[0];
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(fun(stalls,n,k,mid)){
                res=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return res;
        
    }
}
