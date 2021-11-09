import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class coinCombination2 {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        int x = rdr.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++){
            coins[i] = rdr.nextInt();
        }
        int[] dp = new int[x+1];
        Arrays.fill(dp,0);
        dp[0] = 1;
        for(int cns : coins){
            for(int i=0;i<=x;i++){
                if(i-cns>=0 && dp[i-cns]>0){
                    dp[i] += dp[i-cns];
                }
            }
        }
        System.out.println(dp[x]);
    }
}
