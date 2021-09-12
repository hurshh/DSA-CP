import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class distinctNumbers {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int n = r.nextInt();
        HashSet<Long> h = new HashSet<>();
        for(int i=0;i<n;i++){
            long temp = r.nextLong();
            h.add(temp);
        }
        System.out.println(h.size());
    }

}


