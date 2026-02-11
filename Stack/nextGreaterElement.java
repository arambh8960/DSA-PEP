class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> nG=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nG.add(0,-1);
            }else{
                nG.add(0,st.peek());
            }
            st.push(arr[i]);
        }
        return nG;
    }
}