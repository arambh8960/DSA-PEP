class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> nG=new ArrayList<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nG.add(-1);
            }else{
                nG.add(st.peek());
            }
            st.push(arr[i]);
        }
        return nG;
    }
}