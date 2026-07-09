class Solution {
public:
    string sortVowels(string s) {
        string temp;
       
        for(int i=0;i<s.size();i++){
            if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
               temp.push_back(s[i]);
                s[i]='#';
            }
            else if(s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'){
                temp.push_back(s[i]);
                s[i]='#';
            }
        }
        sort(temp.begin(), temp.end());
        int j=0;
        int i=0;
        while(j<s.size()){
            if(s[j]=='#'){
                s[j]=temp[i];
                i++;
            }
            
            j++;
        }
        return s;
        

    }
};