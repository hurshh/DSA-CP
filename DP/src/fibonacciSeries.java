public class fibonacciSeries {
    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        System.out.println(fibncci(45));
        long s2 = System.currentTimeMillis();
        System.out.println(s2-s2);
        long s3 = System.currentTimeMillis();
        int[] DP = new int[46];
        System.out.println(DPfibncci(45,DP));
        long s4 = System.currentTimeMillis();
        System.out.println(s4-s3);
    }
    static int fibncci(int n){
        if(n==0||n==1){
            return n;
        }
        return fibncci(n-1)+fibncci(n-2);
    }
    static int DPfibncci(int n,int[] dp){
        if(n==0||n==1){
            return dp[n] = n;
        }
        if(dp[n] !=0){
            return dp[n];
        }
        return dp[n] = DPfibncci(n-1,dp)+DPfibncci(n-2,dp);
    }
}
