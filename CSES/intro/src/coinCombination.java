import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class coinCombination {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String inp1 = br.readLine();
        final int n = Integer.parseInt(inp1.split(" ")[0]);
        final int c = Integer.parseInt(inp1.split(" ")[1]);
        final String[] inp2 = br.readLine().split(" ");
        final ArrayList<Integer> coins = new ArrayList<>();
        Arrays.stream(inp2).forEach(x -> coins.add(Integer.parseInt(x)));

        int[] dp = new int[c+1];
        Arrays.fill(dp,0);
        dp[0] = 1;
        for(int i=1;i<=c;i++){
            for(int coin : coins){
                if(i-coin>=0){
                    dp[i] += dp[i-coin];
                    dp[i] %= 1000000007;
                }
            }
        }
        System.out.println(dp[c]%1000000007);
    }
}
