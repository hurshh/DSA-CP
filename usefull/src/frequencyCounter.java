import java.util.ArrayList;
import java.util.Arrays;

public class frequencyCounter {
    class storage001{
        long number;
        long frequency;
        storage001(){}
        storage001(long number,long frequency){
            this.number = number;
            this.frequency = frequency;
        }
    }
    ArrayList<storage001> freqCntr(int[] arr){
        ArrayList<storage001> arry = new ArrayList<>();
        Arrays.sort(arr);
        long count=1;
        long len = arr.length;
        for(int i=0;i<len;i++){
            if(i==len-1){
                arry.add(new storage001(arr[i], count));
            }
            else{
                if (arr[i] == arr[i + 1]) {
                    count++;
                } else {
                    arry.add(new storage001(arr[i], count));
                    count = 1;
                }
            }
        }
        return arry;
    }
}

