import java.io.IOException;

public class maximumSubArraySum {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        long[] arr = new long[n];
        long max =0;
        long maxTillNow =0;

        for(int i=0;i<n;i++){
            arr[i] = rdr.nextLong();
            if(i==0){
                max = arr[i];
                maxTillNow = arr[i];
                if(maxTillNow<0){
                    maxTillNow=0;
                }
            }
            else {
                maxTillNow+=arr[i];
                if(maxTillNow>max){
                    max = maxTillNow;
                }
                if(maxTillNow<0){
                    maxTillNow=0;
                }
            }
        }
        System.out.println(max);
    }
}


