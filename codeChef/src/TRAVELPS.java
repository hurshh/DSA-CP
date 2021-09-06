import java.util.Scanner;

public class TRAVELPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a= sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int zero=0,one=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='0'){
                    zero++;
                }
                else {
                    one++;
                }
            }
            System.out.println((zero*a)+(one*b));
        }
    }
}
