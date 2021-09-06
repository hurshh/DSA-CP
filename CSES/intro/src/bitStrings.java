import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class bitStrings {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        BigInteger b1 = BigInteger.valueOf(2);
        BigInteger ans = (b1.pow((int) n)).mod(BigInteger.valueOf(1000000007));
        System.out.println(ans);
    }
}
