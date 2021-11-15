import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class SPECRK {
    public static void main(String[] args) throws IOException {
        fastr rdr = new fastr();
        int t = rdr.nextInt();
        while (t-->0){
            int n = rdr.nextInt();
            int res = 0;
            while(n-->0) {
                res ^= rdr.nextInt();
            }
            System.out.println(res);
        }
    }
}


