import java.util.Arrays;
import java.util.Scanner;

public class N1VALUES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            StringBuilder res = new StringBuilder();
            long sum = n*(n+1)/2;
            long pow = (long) Math.pow(2,n);
            long missing = pow-sum;
            for(int i=1;i<=n;i++){
                arr[i-1] = i;
            }
            arr[n] = (int) missing;
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                res.append(arr[i]).append(" ");
            }
            res.append(arr[n+1]);
            System.out.println(res);
        }
    }
}
