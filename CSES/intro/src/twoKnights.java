import java.io.IOException;

public class twoKnights {
    public static void main(String[] args) throws IOException {
        Reader r1 = new Reader();
        long n = r1.nextLong();
        long i=0;
        while (i++<n){
            System.out.println(solver(i));
        }
    }
    public static long solver(long n){
        return n * n * (n * n - 1) / 2 - 4 * (n - 1) * (n - 2) ;
    }
}

