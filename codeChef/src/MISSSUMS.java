import java.util.Scanner;

public class MISSSUMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            StringBuilder res = new StringBuilder("");
            long temp = 1;
            for(int i=0;i<n;i++){
                res.append(temp).append(" ");
                temp+=2;
            }
            System.out.println(res);
        }
    }
}
