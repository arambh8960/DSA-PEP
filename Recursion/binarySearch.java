// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static boolean binarySearch(int[] arr,int size,int left,int right,int target){
        
        if(right<left){
            return false;
        }
            int mid=left+(right-left)/2;
            if(arr[mid]==target) return true;
            else if(target<arr[mid]){
               return  binarySearch(arr,size,left,mid-1,target);
            }else{
               return binarySearch(arr,size,mid+1,right,target);
            }
         
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=8;
        int[] arr=new int[8];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int target=5;
        System.out.println(binarySearch(arr,n,left,right,target));
    }
}