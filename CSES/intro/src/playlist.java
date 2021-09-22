import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class playlist {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, ArrayList<Integer>> arr2 = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = rdr.nextInt();
            if(arr2.containsKey(arr[i])){
                arr2.get(arr[i]).add(i);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                arr2.put(arr[i],temp);
            }
        }
        int curAns=0,max=0;
        for (int i=0;i<n;i++){
            if(arr2.get(arr[i]).size()>1 && arr2.get(arr[i]).get(0)!=i){
                curAns++;
                if(curAns-arr2.get(arr[i]).get(0)>max){
                    max = curAns;
                }
                arr2.get(arr[i]).remove(0);
            }
            else {
                curAns++;

            }
        }
        System.out.println(max);
    }
}

