class Solution {
public:
    void dfs(int city,vector<vector<int>>& arr,vector<bool> &isVisited){
        //mark the curr city as visited
        isVisited[city]=true;
        for(int nc=0;nc<arr.size();nc++){
            if(arr[city][nc]==1&&!isVisited[nc]){
                dfs(nc,arr,isVisited);
            }
        }
    }
    int findCircleNum(vector<vector<int>>& arr) {
        int n=arr.size();
        vector<bool> isVisited(n,false);
        int pc=0;
        //loop over all cities
        for(int i=0;i<n;i++){
            if(!isVisited[i]){
                //dfs
                dfs(i, arr, isVisited);
                pc++;  
            }
        }
        return pc;
    }
};