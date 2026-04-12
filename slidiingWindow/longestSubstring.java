class Solution {
    public int longestKSubstr(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        
        int max=-1;
        int l=0;
        int r=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),map.get(s.charAt(r))+1);
                
            }else{
                map.put(s.charAt(r),1);
                
            }
            while(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0)map.remove(s.charAt(l));
                l++;
            }
            if(map.size()==k){
            max=Math.max(max,r-l+1);
           
            }
            r++;
        }
        return max;
        
        
    }
}