import java.util.Scanner;

class binaryExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            System.out.println(recBinary(a,b,n));
        }
    }
    static long forBinary(long a,long b,long n){
        long ans=1;
        while(b>0){
            if(b%2==1){
                ans = ((a%n)*(ans%n))%n;
            }
            a = ((a%n)*(a%n))%n;
            b /=2;
        }
        return ans;
    }
    static long recBinary(long a,long b, long n){
        if(b==0){
            return 1;
        }
        long ans = recBinary(a,b/2, n);
        if(b%2==1){
            return ((ans%n)*(ans%n)*(a%n))%n;
        }
        else {
            return ((ans%n)*(ans%n))%n;
        }
    }
}
