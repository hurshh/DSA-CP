import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class collectingNumbers {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        ArrayList<store> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            int temp = rdr.nextInt();
            arr.add(new store(temp,i));
        }
        Collections.sort(arr,(a,b) -> a.number - b.number);
        int rounds = 0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                rounds++;
            }
            else if(arr.get(i).index>arr.get(i+1).index){
                rounds++;
            }
        }
        System.out.println(rounds);
    }
}
class store{
    int number;
    int index;
    store(int number,int index){
        this.number = number;
        this.index = index;
    }
}

