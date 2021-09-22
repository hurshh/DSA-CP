import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class MissingCoinSum {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        Integer[] coinsSum = new Integer[n];
        for (int i=0;i<n;i++){
            coinsSum[i] = rdr.nextInt();
        }
        Arrays.sort(coinsSum);
        long ans=1;
        for(int i=0;i<n;i++){
            if(ans<coinsSum[i]){
                System.out.println(ans);
                break;
            }
            else {
                ans += coinsSum[i];
            }
            if(i==n-1){
                System.out.println(ans);
            }
        }

    }
}


