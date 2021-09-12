import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ferrisWheel {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        int x = rdr.nextInt();
        long numberOfGondola =0;
        int leftIndex =0;
        int rightIndex = n-1;
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i] = rdr.nextInt();
        }
        Arrays.sort(arr);
        while(rightIndex>leftIndex){
            if(arr[rightIndex]+arr[leftIndex]<=x ){
                numberOfGondola++;
                rightIndex--;
                leftIndex++;
            }
            else{
                numberOfGondola++;
                rightIndex--;
            }
        }
        if(leftIndex==rightIndex && arr[leftIndex]<x){
            numberOfGondola++;
        }
        System.out.println(numberOfGondola);
    }
}

