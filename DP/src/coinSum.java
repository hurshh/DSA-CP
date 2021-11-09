import java.util.ArrayList;
import java.util.Scanner;

public class coinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int numberOfCoins = sc.nextInt();
        int[] coins = new int[numberOfCoins];
        for(int i=0;i<numberOfCoins;i++){
            coins[i] = sc.nextInt();
        }
        int[] dp = new int[sum+1];
        int[] arrCoin = new int[sum+1];
        dp[0] = 0;
        arrCoin[0] = 0;
        for(int i=1;i<=sum;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int c:coins){
                if(i-c>=0 && dp[i-c]+1<dp[i]){
                    dp[i] = dp[i-c]+1;
                    arrCoin[i] = c;
                }
            }
        }
        System.out.println(dp[sum]);
        for (int i=sum;i>0;){
            System.out.print(arrCoin[i]+" ");
            i -= arrCoin[i];
        }
    }
}
