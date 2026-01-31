// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static boolean isSorted(int[] arr,int s){
        if(s==0||s==1) return true;
        if(arr[0]>arr[1]) return false;
        int[] next=new int[s-1];
        for(int i=0;i<s-1;i++){
            next[i]=arr[i+1];
        }
        return isSorted(next,s-1);
        
       
        
    }
    public static void main(String[] args) {
     int[] arr={1,2,7,5};
    int n=4;
     
     System.out.print(isSorted(arr,n));
    }
}