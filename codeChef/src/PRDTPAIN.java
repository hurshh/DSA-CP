import java.util.Scanner;

public class PRDTPAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n  = sc.nextInt();
            long sum =0;
            int[] arr =new int[n];
            for (int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            long result =0;
            long Isum = sum;
            for(int i=0;i<=n-3;i++){
                Isum -= arr[i];
                long Jsum = Isum;
                for (int j=i+1;j<=n-2;j++){
                    Jsum -= arr[j];
                    result += (arr[i]-arr[j])*(((long) (n - 1 - j) *arr[j])- Jsum);
                }
            }
            System.out.println(result);
        }


    }
}
