import java.io.IOException;

public class diceCombinations {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        int[] dice = {1,2,3,4,5,6};
        long[] dp = new long[n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            for (int d:dice){
                if(i-d>=0){
                    dp[i] += dp[i-d];
                    dp[i] %= 1000000007;
                }
            }
        }
        System.out.println(dp[n]%1000000007);
    }
}

