import java.util.Scanner;

class DATE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long a = sc.nextLong();
            long y = sc.nextLong(); //life of lit candle
            long x = sc.nextLong(); //number of candles lit further
            long ans;
            if(a>=y)
            {
                ans = (long)x*y;
                System.out.println(ans);
            }
            else
            {
                ans = (long)a*x+1;
                System.out.println(ans);
            }
        }
    }
}
