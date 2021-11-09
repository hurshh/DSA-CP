import java.util.Scanner;

public class ADDNDIV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a %= b;
            b %= a;
            if(b % a == 0 || b == 0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}

