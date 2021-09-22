import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class missingNumbers2 {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        int m = rdr.nextInt();
        int[] arr = new int[n];
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<n;i++){
            arr[i] = rdr.nextInt();
        }
        ArrayList<StoreIndices> indices= new ArrayList<>();
        for(int i=0;i<m;i++){
            int index1 = rdr.nextInt();
            int index2 = rdr.nextInt();
            indices.add(new StoreIndices(--index1,--index2));
        }
        int cruss = printAns(n,arr);
        for(int i=0;i<m;i++){
            swap(indices.get(i).index1,indices.get(i).index2,arr);
        }
        System.out.println(res);
    }
    static void swap(int index1,int index2,int[] arr){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int printAns(int n,int[] arr){
        ArrayList<StoreNums> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            temp.add(new StoreNums(arr[i],i));
        }
        Collections.sort(temp,(a, b) -> a.number - b.number);
        int rounds = 0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                rounds++;
            }
            else if(temp.get(i).index>temp.get(i+1).index){
                rounds++;
            }
        }
        return rounds ;
//        System.out.println(rounds);
    }
}
class StoreNums{
    int number;
    int index;
    StoreNums(int number,int index){
        this.number = number;
        this.index = index;
    }
}
class StoreIndices{
    int index1;
    int index2;
    StoreIndices(int index1,int index2){
        this.index1 = index1;
        this.index2 = index2;
    }
}


