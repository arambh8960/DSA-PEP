https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
     int i   =0;
     int j=0;
     while(i<s.length()&&j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
            i++;
            
        }
            j++;
        
     }
     
     return i==s.length();
     
     
    }
}

https://www.geeksforgeeks.org/problems/find-first-repeated-character4108/1

// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
       HashSet<Character> set=new HashSet<>();
     
       for(int i=0;i<s.length();i++){
           if(!set.contains(s.charAt(i))){
               set.add(s.charAt(i));
               
           }else{
               return String.valueOf(s.charAt(i));

           }
           
       }
       return "-1";
    }
}

https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }
}