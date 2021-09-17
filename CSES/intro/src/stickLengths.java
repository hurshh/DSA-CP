import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class stickLengths {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        Integer[] stickL = new Integer[n];
        for(int i=0;i<n;i++){
            stickL[i] = rdr.nextInt();
        }
        Arrays.sort(stickL);
        int midVal = stickL[n/2];
        long ans = 0;
        for(int i =0;i<n ;i++){
            ans += Math.abs(stickL[i]-midVal);
        }
        System.out.println(ans);
    }
}

