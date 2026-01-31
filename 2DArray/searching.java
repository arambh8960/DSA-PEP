// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    static boolean isPresent(int[][] arr,int target,int row,int col){
        for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
              if(arr[i][j]==target){
                  return true;
              }
              
          }
          
      }
     return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=3;
        int col=4;
        int target=55;
      int[][] arr=new int[row][col];
      for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
              arr[i][j]=sc.nextInt();
              
          }
      }
      System.out.print(isPresent(arr,target,row,col));
  
    }
}