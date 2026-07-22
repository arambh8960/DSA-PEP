class Solution {
  public:
    vector<int> getDivisors(int n) {
        // code here
        vector<int> ans;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans.push_back(i);
            }
        }
        return ans;
    }
};