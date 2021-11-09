import java.util.Arrays;
import java.util.Scanner;

public class MEDMAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] arr = new int[n*n];
            for(int i =0;i<(n*n);i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long ans = 0;
            for(int i=n*n/2;i<=(n*n/2)+n;i++){
                ans+=arr[i];
            }
            if(ans<=k){
                System.out.println(arr[n*n/2]);
            }
            else {
                System.out.println("-1");
            }
        }
    }
}
