import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class MNDIGSUM {
    public static void main(String[] args) throws IOException {
        fastr r = new fastr();
        int t = r.nextInt();
        while(t-->0){
            int N = r.nextInt();
            int L = r.nextInt();
            int R = r.nextInt();
            int ans = 0;
            int minvalue = Integer.MAX_VALUE;
            if(R>N){
                System.out.println(R);
            }
            else if(L<N && N<R){
                System.out.println(N);
            }
            else {
                for(int i=R;i>=L;i--) {
                    if(minvalue==1) break;
                    int sum=0;
                    int temp=N;
                    while(temp>0){
                        sum+=temp%i;
                        temp/=i;
                        if(sum>minvalue) break;
                    }
                    if(minvalue>sum){
                        ans=i;
                        minvalue=sum;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}


