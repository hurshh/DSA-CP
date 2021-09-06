package recursive;

public class r2 {
    public static void main(String[] args) {
        System.out.println(rfact(5));
    }
    static int rfact(int n ){
        if(n==1){
            return 1;
        }
        int ans = n*(rfact(n-1));
        return ans;
    }
}

