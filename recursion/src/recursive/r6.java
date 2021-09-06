package recursive;

public class r6 {
    public static void main(String[] args) {
        System.out.println(exp(5));
    }
    static int exp(int n){
        if (n==0){
            return 1;
        }
        int xo = exp(n/2);
        if(n%2 ==0){
            return xo*xo;
        }
        else {
            return xo*xo*2;
        }

    }
}
