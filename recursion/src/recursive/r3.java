package recursive;

public class r3 {
    public static void main(String[] args) {
        r1headprint(5);
        System.out.println();
        r1tailprint(5);
    }
    static void r1headprint(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        r1headprint(n-1);
    }
    static void r1tailprint(int n){
        if(n==0){
            return;
        }
        r1tailprint(n-1);
        System.out.print(n+" ");
    }
}
