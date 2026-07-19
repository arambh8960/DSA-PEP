class Solution {
  public:
    vector<int> productExceptSelf(vector<int>& arr) {
        // code here
        vector<int>ans(arr.size());
        ans[0]=1;
        for(int i=1;i<arr.size();i++){
            ans[i]=ans[i-1]*arr[i-1];
        }
        int suff=1;
        for(int i=arr.size()-2;i>=0;i--){
            suff=arr[i+1]*suff;
            ans[i]=ans[i]*suff;
        }
        return ans;
    }
};
