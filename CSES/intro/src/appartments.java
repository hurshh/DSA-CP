import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class appartments {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int n = r.nextInt();
        int m = r.nextInt();
        long k = r.nextLong();
        long ans =0;
        ArrayList<appartment> arr1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            long temp = r.nextLong();
            arr1.add(new appartment(temp,k));
        }
        long[] arr2 = new long[m];
        for(int i=0;i<m;i++){
            arr2[i] = r.nextLong();
        }
        Collections.sort(arr1,(a,b) -> (int) (a.customerSize - b.customerSize));
        Arrays.sort(arr2);
        int Cindex=0,Aindex=0,cc=n;
        while(Cindex<n && Aindex<m){
            if(arr1.get(Cindex).customerSize-k>arr2[Aindex]){
                Aindex++;
            }
            else {
                if (arr1.get(Cindex).customerSize +k < arr2[Aindex]) {
                    Cindex++;
                } else {
                    ans++;
                    Cindex++;
                    Aindex++;
                }
            }
        }
        System.out.println(ans);
    }
}
class appartment{
    long customerSize;
    long k;
    appartment(long customerSize,long k){
        this.customerSize = customerSize;
        this.k = k;
    }
}

