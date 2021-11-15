import java.io.IOException;

public class XORAGN {
    public static void main(String[] args) throws IOException {
        fastr rdr = new fastr();
        int t = rdr.nextInt();
        while (t-->0){
            int n = rdr.nextInt();
            long ans = rdr.nextLong();
            ans *= 2;
            for(int i=1;i<n;i++){
                long temp = rdr.nextLong();
                temp *= 2;
                ans = ans^temp;
            }
            System.out.println(ans);
        }
    }
}

