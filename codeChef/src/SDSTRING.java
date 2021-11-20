import java.io.IOException;
import java.util.Scanner;

public class SDSTRING {
    public static void main(String[] args) throws IOException {
        Scanner rdr = new Scanner(System.in);
        int t = rdr.nextInt();
        rdr.nextLine();
        while (t-->0){
            String str = rdr.nextLine();
            int len = str.length();
            int zeroes =0;
            int ones = 0;
            for(int i=0;i<len;i++){
                if(str.charAt(i) == '0'){
                    zeroes++;
                }
                else {
                    ones++;
                }
            }
            if(len%2==0) {
                if(zeroes ==len || ones==len){
                    System.out.println("-1");
                }
                else {
                    int remains = Math.abs(zeroes - ones);
                    System.out.println(remains / 2);
                }
            }
            else {
                System.out.println("-1");
            }
        }
    }
}
