import java.util.Scanner;

public class MAGDOORS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            int flips = 0;
            int len = str.length();
            for(int i=0;i<len;i++){
                if(i==len-1){
                    flips++;
                    break;
                }
                if(str.charAt(i)!= str.charAt(i+1)){
                    flips++;
                }
            }
            if(str.charAt(0)=='0'){
                System.out.println(flips);
            }
            else {
                System.out.println(flips-1);
            }
        }
    }
}
