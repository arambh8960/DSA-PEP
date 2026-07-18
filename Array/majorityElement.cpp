class Solution {
  public:
    int majorityElement(vector<int>& arr) {
        // code here
        int el;
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(count==0){
                count=count+1;
                el=arr[i];
            }else if(arr[i]==el){
                count++;
            }else{
                count--;
            }
        }
        count =0;
        for(int i=0;i<arr.size();i++){
            if(el==arr[i]){
                count++;
            }
        }
        if(count>arr.size()/2){
            return el;
        }
        return -1;
    }
};