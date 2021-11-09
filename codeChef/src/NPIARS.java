import java.util.Scanner;

public class NPIARS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            long ans=0;
            String str = sc.nextLine();
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(Math.abs(Character.getNumericValue(str.charAt(i))-Character.getNumericValue(str.charAt(j))) == j-i){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
