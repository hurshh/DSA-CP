import java.util.Scanner;

public class DIVEO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while ((t-->0)) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int odd = 0, even = 0, ans = 0;
            for (int i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    n /= i;
                    if (i % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                }
            }
            if (n > 1) {
                if (n % 2 == 0)
                    even++;
                else
                    odd++;
            }
            if(a>=0 && b>=0){
                System.out.println(a*even+b*odd);
                continue;
            }else if(a>=0 && b<0){
                if(even>0)
                    ans=a*even;
                else if(odd>0)
                    ans=b;
            }else if(a<0 && b>=0){
                ans=b*odd;
                if(even>0)
                    ans+=a;
            }else if(a<0 && b<0){
                if(even>0)
                    ans+=a;
                else if(odd>0)
                    ans+=b;
            }
            System.out.println(ans);
        }
    }
}
