import java.io.IOException;

public class trailingZeroes {
    public static void main(String[] args) throws IOException {
        Reader r1 = new Reader();
        long n = r1.nextLong();
        System.out.println(trailZeroes(n));
    }
    static long trailZeroes(long n){
        long ctr = n,count2=0,count5=0;
        while(ctr>0){
            count2 += ctr/2;
            ctr /= 2;
        }
        ctr =n;
        while (ctr>0){
            count5 += ctr/5;
            ctr /= 5;
        }
        if(count2<count5){
            return count2;
        }
        else {
            return count5;
        }
    }
}

