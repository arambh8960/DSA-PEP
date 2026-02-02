// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
    int[][] arr=new int [3][3];
      for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             arr[i][j]=sc.nextInt();
         }
      }
      int sum=0;
     int max=0;
     int maxIndex=-1;
      
      for(int i=0;i<3;i++){
          sum=0;
         for(int j=0;j<3;j++){
             sum=arr[i][j]+sum;
         }
         System.out.println(sum);
         if(sum>max){
             max=sum;
             maxIndex=i;
         }
         
         
      }
      System.out.println("Row with maximum sum: " + maxIndex);
        System.out.println("Maximum sum: " + max);
    }
}