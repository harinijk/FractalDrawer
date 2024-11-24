class Solution {
    public static double myPow(double x, int n) {
        if(n==1){
            return x;
        }
        else{
           
            return x*myPow(x,n-1);
        }
        
    }

    public static void main(String[]args){
        System.out.print(myPow(2,2));
    }
}

