import java.io.IOException;
import java.util.Arrays;

public class minimizingCoins {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        int x = rdr.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++){
            coins[i] = rdr.nextInt();
        }
        int[] dp = new int[x+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for (int i=1;i<=x;i++){
            int min = Integer.MAX_VALUE;
            for (int coin:coins){
                if(i-coin>=0 && dp[i-coin]!=-1){
                    min = Math.min(min,dp[i-coin]+1);
                    dp[i] = min;
                }
            }
        }
        System.out.println(dp[x]);
    }
}

