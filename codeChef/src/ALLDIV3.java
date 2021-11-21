import java.util.Scanner;

public class ALLDIV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int zeroes=0;
            int ones=0;
            int twoes=0;
            int ans=0;
            long sum =0;
            for(int i=0;i<n;i++){
                long temp = sc.nextLong();
                sum += temp;
                if(temp%3==0){
                    zeroes++;
                }
                else if(temp%3==1){
                    ones++;
                }
                else {
                    twoes++;
                }
            }
            if(sum%3 != 0){
                System.out.println("-1");
            }else {
                if(ones == twoes){
                    System.out.println(ones);
                }
                else if(ones>twoes){
                    System.out.println(twoes + ((ones-twoes)/3)*2);
                }
                else {
                    System.out.println(ones + ((twoes-ones)/3)*2);
                }
            }
        }
    }
}
