import java.util.Scanner;

public class DIWALI1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long p = sc.nextLong();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc . nextInt();
            long anar = b + (long) x *a;
            long chakri = c + (long) y *a;
            long ans =0;
            if(anar<chakri){
                ans = p/anar;
                ans += (p%anar)/chakri;
                System.out.println(ans);
            }
            else {
                ans = p/chakri;
                ans += (p%chakri)/anar;
                System.out.println(ans);
            }
        }
    }
}
