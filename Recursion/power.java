// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int  power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
       
        
    }
    public static void main(String[] args) {
     int x=10;
     int n=4;
     System.out.print(power(x,n));
    }
}