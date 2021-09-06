import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<storagee> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            long temp = sc.nextLong();
            arr.add(new storagee(temp,i));
        }
        Collections.sort(arr,(a,b) -> (int) (a.number - b.number));
    }
}
class storagee{
    long number;
    int index;
    storagee(){}
    storagee(long number,int index){
        this.number=number;
        this.index=index;
    }
}
