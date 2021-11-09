import java.util.Scanner;

public class CHEFCAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            long v = sc.nextLong();
            long min=0,max=0;
            if(v>=n-1) {
                min = n - 1;
            }
            max=(n*(n-1))/2;
            if(v<n) {
                min = ((n - v) * (n - v + 1)) / 2 + (v - 1);
            }
            System.out.println(max+" "+min);
        }
    }
}
