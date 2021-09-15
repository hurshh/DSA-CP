import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class movieFestival {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        ArrayList<movieTimes> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int tempStart = rdr.nextInt();
            int tempEnd = rdr.nextInt();
            arr.add(new movieTimes(tempStart, tempEnd));
        }
        Collections.sort(arr, (a, b) -> a.end - b.end);
        int ans = 0;
        int endOfLastMovie = Integer.MIN_VALUE;
        int index = 0;
        while (index<n){
            if(arr.get(index).start>=endOfLastMovie){
                ans++;
                endOfLastMovie = arr.get(index).end;
                index++;
            }
            else {
                index++;
            }
        }
        System.out.println(ans);
    }

}
class movieTimes {
    int start;
    int end;

    movieTimes(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
