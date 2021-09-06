package recursive;

public class r9 {
    public static void main(String[] args) {
        System.out.println(countSteps(4));
    }
    static int countSteps(int n){
        if(n==1||n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return countSteps(n-1)+countSteps(n-2)+countSteps(n-3);
    }
}
