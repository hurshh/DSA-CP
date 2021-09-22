import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class playlist {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        HashMap<Integer,Integer> hsh = new HashMap<>();
        long count =0;
        long max=0;
        int lastCut = -1;
        for(int i=1;i<=n;i++){
            int temp = rdr.nextInt();
            if(!hsh.containsKey(temp)){
                hsh.put(temp,i);
                count++;
                if(count>max){
                    max = count;
                }
            }
            else {
                int lastIndex = hsh.get(temp);
                if(lastIndex>lastCut){
                    lastCut = lastIndex;
                    count = i - lastIndex;
                    if (count > max) {
                        max = count;
                    }
                }else {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                }
                hsh.put(temp, i);
            }
        }
        System.out.println(max);
    }
}


