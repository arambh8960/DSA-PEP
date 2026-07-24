class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!=t.size())return false;
       int freq1[26]={0} ;

       for(int i=0;i<s.size();i++){
         freq1[s[i]-'a']++;
       }
       for(int i=0;i<t.size();i++){
         freq1[t[i]-'a']--;
       }
       for(int i=0;i<26;i++){
        if(freq1[i]!=0)return false;
       }
       return true;
    }
};