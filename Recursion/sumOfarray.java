

class Main {
    public static int sum(int[] arr,int s){
        if(s==0) return 0;
        
        int[] next=new int[s-1];
        for(int i=0;i<s-1;i++){
            next[i]=arr[i+1];
        }
        return arr[0]+ sum(next,s-1);
        
       
        
    }
    public static void main(String[] args) {
     int[] arr={1,2,7,5};
    int n=4;
     
     System.out.print(sum(arr,n));
    }
}