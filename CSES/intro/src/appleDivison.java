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
        Arrays.sort(qArr);
        long halfSum = sum/2;
        long leftcount =0;
        long rightcount =0;
        for(int i=n-1;i>=0;i--){
            if(halfSum >= leftcount+qArr[i]){
                leftcount += qArr[i];
            }
            else {
                rightcount += qArr[i];
            }
        }
        System.out.println(rightcount-leftcount);
    }
}


