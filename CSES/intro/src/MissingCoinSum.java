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
        int count=1;
        int index = 1;
        int tempSum = coinsSum[0];
        int ans = -1;
        while (true){
            if(tempSum==count){
                count++;
                tempSum += coinsSum[index++];
            }
            else {
                ans = count;
                break;
            }

        }
        System.out.println(ans);
    }
}
