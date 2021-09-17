import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class collectingNumbers2 {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        int m = rdr.nextInt();
        StringBuilder res = new StringBuilder("");

        ArrayList<store2> arr = new ArrayList<>();
        ArrayList<storeIndices> arrI = new ArrayList<>();
        for(int i=1;i<=n;i++){
            int temp = rdr.nextInt();
            arr.add(new store2(temp,i));
        }
        for(int i=0;i<m;i++){
            int index1 = rdr.nextInt();
            int index2 = rdr.nextInt();
            index1--;
            index2--;
            arrI.add(new storeIndices(index1,index2));
        }
        for(int i=0;i<m;i++){
            swap(arr,arrI.get(i).index1,arrI.get(i).index2);
            System.out.println(numberOfRounds(arr,n));
        }
    }

    static int numberOfRounds(ArrayList<store2> arr, int n){
        ArrayList<store2> arrt = arr;
        Collections.sort(arrt,(a, b) -> a.number - b.number);
        int rounds = 0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                rounds++;
            }
            else if(arrt.get(i).index>arrt.get(i+1).index){
                rounds++;
            }
        }
        return rounds;
    }

    static void swap(ArrayList<store2> arr,int index1,int index2){
        int temp = arr.get(index1).number;
        arr.get(index1).number = arr.get(index2).number;
        arr.get(index2).number = temp;
    }

}


class store2{
    int number;
    int index;
    store2(int number,int index){
        this.number = number;
        this.index = index;
    }
}
class storeIndices{
    int index1;
    int index2;
    storeIndices(int index1,int index2){
        this.index1 = index1;
        this.index2 = index2;
    }
}