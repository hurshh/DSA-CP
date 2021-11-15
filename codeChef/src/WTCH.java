import java.io.IOException;
import java.util.Scanner;

public class WTCH {
    public static void main(String[] args) throws IOException {
        Scanner rdr = new Scanner(System.in);
        int t = rdr.nextInt();
        while (t-->0){
            int n = rdr.nextInt();
            rdr.nextLine();
            char[] arr = rdr.nextLine().toCharArray();
            if(n==1){
                if(arr[0]=='0'){
                    System.out.println('1');
                }
                else {
                    System.out.println('0');
                }
            }
            else {
                int count = 0;
                if (arr[0] == '0' && arr[1] == '0') {
                    arr[0] = '1';
                    count++;
                }
                for (int i = 1; i < n - 1; i++) {
                    if (arr[i] == '0' && arr[i - 1] == '0' && arr[i + 1] == '0') {
                        arr[i] = '1';
                        count++;
                    }
                }
                if (arr[n - 1] == '0' && arr[n - 2] == '0') {
                    arr[n - 1] = '1';
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}

