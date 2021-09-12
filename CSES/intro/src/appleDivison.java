import java.io.IOException;
import java.util.Arrays;

public class appleDivison {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int n = r.nextInt();
        long qArr[] = new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            qArr[i] = r.nextLong();
            sum+= qArr[i];
        }
        int pow2 = (int) Math.pow(2,n);
        long ans = Integer.MAX_VALUE;
        for(int i=0;i<pow2;i++){
            long temp =0;
            for (int j=0;j<n;j++){
                if ((i & 1<<j) == 1){
                    temp += qArr[i];
                }
            }
            long current = Math.abs((sum-temp)-temp);
            ans = Math.min(ans,current);
        }
        System.out.println(ans);

    }
}


