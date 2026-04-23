class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] words=s.split("\\.+");
        StringBuilder st=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
             if(words[i].isEmpty()) continue; 
            st.append(words[i]);
            st.append(".");
        }
        if(st.length()>0)st.deleteCharAt(st.length()-1);
        return st.toString().trim();
    }
}
