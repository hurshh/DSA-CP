import java.util.Scanner;

public class oppositeWho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int diff = b-a;
            if(diff<0){
                diff *= -1;
            }
            int expectedTotalNo = 2*diff;
            if(a>expectedTotalNo||b>expectedTotalNo||c>expectedTotalNo){
                System.out.println("-1");
            }
            else{
                if(c+diff<=expectedTotalNo){
                    System.out.println(c+diff);
                }
                else {
                    if(c-diff>0){
                        System.out.println(c-diff);
                    }
                    else {
                        System.out.println("-1");
                    }
                }
            }
        }
    }

}
