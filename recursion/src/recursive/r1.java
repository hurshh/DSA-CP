package recursive;

public class r1 {
    public static void main(String[] args) {
        rprint(3);
    }
    static void rprint(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        rprint(n-1);
    }
}
