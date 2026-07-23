class Solution {
  public:
    int gcd(int a, int b) {
        // code here
        while(b!=0&&a!=0){
            if(b>a){
                b=b%a;
            }else{
                a=a%b;
            }
        }
        if(a==0){
            return b;
        }else{
            return a;
        }
    }
};
