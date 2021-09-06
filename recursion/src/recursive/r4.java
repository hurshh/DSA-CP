package recursive;

public class r4 {
    public static void main(String[] args) {
        System.out.println(rfibonacci(0));
        System.out.println(ffibonacci(0));

    }
    static int rfibonacci(int n){
        if(n==0|| n==1){
            return n;
        }
        n = rfibonacci(n-1)+rfibonacci(n-2);
        return n;
    }
    static int ffibonacci(int n){
        int a1=0,a2=1,a3=0;
        while (n-->0){
            a3 = a1+a2;
            a1 =a2;
            a2 = a3;
        }
        return a1;
    }
}
